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
package my.cyclingrace.StageRanking.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.StageRanking.Dao.StageRankingDao;
import my.cyclingrace.StageRanking.Service.StageRankingService;
import my.cyclingraceDaoService.model.StageRankingModel;



public class DefaultStageRankingService implements StageRankingService
{
	StageRankingDao stageRankingDao;


	/**
	 * @return the stageRankingDao
	 */
	public StageRankingDao getStageRankingDao()
	{
		return stageRankingDao;
	}


	@Required
	public void setStageRankingDao(final StageRankingDao stageRankingDao)
	{
		this.stageRankingDao = stageRankingDao;
	}


	@Override
	public List<StageRankingModel> getAllStageRankingModel()
	{
		if (!stageRankingDao.findAllStageRanking().isEmpty())
		{
			final List<StageRankingModel> stageRankings = stageRankingDao.findAllStageRanking();
			return stageRankings;
		}
		else
		{
			return null;
		}
	}

}
