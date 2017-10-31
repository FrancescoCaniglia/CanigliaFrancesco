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
package my.cyclingrace.Interceptor.StageRace;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.Stage.Service.StageService;
import my.cyclingraceDaoService.model.StageModel;
import my.cyclingraceDaoService.model.StageRaceModel;


/**
 *
 */
public class StageRacePrepareInterceptor implements PrepareInterceptor<StageRaceModel>
{

	StageService stageService;



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



	@Override
	public void onPrepare(final StageRaceModel stageRace, final InterceptorContext ctx) throws InterceptorException
	{

		if (stageRace.getEndDate() != null)
		{
			final List<StageModel> stages = stageService.getStageforStageRace(stageRace.getCode());
			for (final StageModel sm : stages)
			{

				final Date startDate = sm.getStartdate();
				final Calendar date = Calendar.getInstance();
				final int days = sm.getDays().intValue();
				date.setTime(startDate);
				date.add(Calendar.DATE, days);

				final Date endDate = date.getTime();
				sm.setEndDate(endDate);

			}
		}

	}

}
