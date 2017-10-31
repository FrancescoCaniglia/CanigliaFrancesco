/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.cyclingrace.Stage.Service.Impl;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.event.EventService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.CyclistRanking.Service.CyclistRankingService;
import my.cyclingrace.EventListner.CronJobEvent;
import my.cyclingrace.Stage.Service.StageService;
import my.cyclingrace.StageRanking.Service.StageRankingService;
import my.cyclingraceDaoService.model.CyclistRankingModel;
import my.cyclingraceDaoService.model.StageModel;
import my.cyclingraceDaoService.model.StageRankingModel;


/**
 *
 */
public class MyNewStageJob extends AbstractJobPerformable<CronJobModel>
{

	StageService stageService;
	StageRankingService stageRankingService;
	static CyclistRankingService cyclistRankingService;
	CronJobEvent myjob;

	//ANNOTATION FOR EVENT/LISTENER
	@Resource
	EventService eventService;

	/**
	 * @return the stageService
	 */
	public StageService getStageService()
	{
		return stageService;
	}


	@Required
	public void setStageService(final StageService stageService)
	{
		this.stageService = stageService;
	}


	/**
	 * @return the stageRankingService
	 */
	public StageRankingService getStageRankingService()
	{
		return stageRankingService;
	}


	@Required
	public void setStageRankingService(final StageRankingService stageRankingService)
	{
		this.stageRankingService = stageRankingService;
	}


	/**
	 * @return the cyclistRankingService
	 */
	public static CyclistRankingService getCyclistRankingService()
	{
		return cyclistRankingService;
	}


	@Required
	public static void setCyclistRankingService(final CyclistRankingService cyclistRankingService)
	{
		MyNewStageJob.cyclistRankingService = cyclistRankingService;
	}


	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{
		final List<StageModel> stages = stageService.getAllStage();
		final List<StageModel> newStages = new ArrayList<StageModel>();
		for (final StageModel sm : stages)
		{
			//CONTROL IF NEWS STAGES ARE IN DB
			if (sm.getCreationtime().after(cronJob.getStartTime()))
			{
				newStages.add(sm);
			}
		}
		if (newStages.isEmpty())
		{
			return new PerformResult(CronJobResult.UNKNOWN, CronJobStatus.FINISHED);
		}
		else
		{
			final List<StageRankingModel> stageRankings = stageRankingService.getAllStageRankingModel();


			for (final StageModel sm : newStages)
			{
				for (final StageRankingModel sr : stageRankings)
				{
					final String codeNewStages = sm.getCode();
					//MATCH OF ONE STAGERANKING WITH THE STAGE CONSIDERED
					if (sr.getStage().getCode().equals(codeNewStages))
					{
						//THIS LINE TAKE FROM DB ONLY CYCLISTRANKING OF STAGERACE TOOK BY THE STAGERANKING CONSIDERED
						final List<CyclistRankingModel> cyclistRankForStageRace = cyclistRankingService
								.getCyclistRankingForStageRace(sm.getStageRace().getCode());
						for (final CyclistRankingModel cr : cyclistRankForStageRace)
						{
							//UPDATE OF NEW TOTAL TIME
							final int partialTime = sr.getTimeInSeconds().intValue();
							if (cr.getCyclist().getCode().equals(sr.getCyclist().getCode()))

							{
								final Integer totalTime = new Integer(partialTime + cr.getTimeTotInSeconds().intValue());
								cr.setTimeTotInSeconds(totalTime);
							}
						}
						//SAVE INTO DB OF ORDERED CYCLIST RANKINGS
						modelService.save(cyclistRankingOrder(cyclistRankForStageRace));
					}
				}
			}


		}
		//LAUNCH OF EVENT
		eventService.publishEvent(myjob);
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}


	//METHOD FOR ORDERING CYCLIST RANKING FOR EACH STAGE RACE BY NEW STAGES
	public static List<CyclistRankingModel> cyclistRankingOrder(final List<CyclistRankingModel> cyclistRankings)
	{
		int minTime = 0;
		for (int i = 0; i < cyclistRankings.size(); i++)
		{
			for (int j = 0; j < cyclistRankings.size() - 1; j++)
			{
				minTime = cyclistRankings.get(i).getTimeTotInSeconds().intValue();
				if (minTime > cyclistRankings.get(j + 1).getTimeTotInSeconds().intValue())
				{
					final int newRanking = cyclistRankings.get(j + 1).getRaceRanking().intValue();
					cyclistRankings.get(j + 1).setRaceRanking(cyclistRankings.get(i).getRaceRanking());
					cyclistRankings.get(i).setRaceRanking(new Integer(newRanking));
				}

			}
		}
		return cyclistRankings;
	}
}
