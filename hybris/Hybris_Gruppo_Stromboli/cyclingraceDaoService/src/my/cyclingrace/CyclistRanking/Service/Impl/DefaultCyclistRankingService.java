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
package my.cyclingrace.CyclistRanking.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.CyclistRanking.Dao.CyclistRankingDao;
import my.cyclingrace.CyclistRanking.Service.CyclistRankingService;
import my.cyclingraceDaoService.model.CyclistRankingModel;


/**
 *
 */
public class DefaultCyclistRankingService implements CyclistRankingService
{

	CyclistRankingDao cyclistRankingDao;



	/**
	 * @return the cyclistRankingDao
	 */
	public CyclistRankingDao getCyclistRankingDao()
	{
		return cyclistRankingDao;
	}



	@Required
	public void setCyclistRankingDao(final CyclistRankingDao cyclistRankingDao)
	{
		this.cyclistRankingDao = cyclistRankingDao;
	}



	@Override
	public List<CyclistRankingModel> getAllCyclistRankingOrdered()
	{
		final List<CyclistRankingModel> cyclistRankings = cyclistRankingDao.findAllCyclistRankingOrdered();
		return cyclistRankings;
	}



	@Override
	public List<CyclistRankingModel> getCyclistRankingForStageRace(final String code)
	{
		if (!cyclistRankingDao.findCyclistRankingByStageRace(code).isEmpty())
		{
			final List<CyclistRankingModel> cyclistRankForStageRace = cyclistRankingDao.findCyclistRankingByStageRace(code);
			return cyclistRankForStageRace;
		}
		else
		{
			return null;
		}
	}

}
