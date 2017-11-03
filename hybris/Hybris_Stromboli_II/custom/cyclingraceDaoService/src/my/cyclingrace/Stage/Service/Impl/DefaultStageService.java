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

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.Stage.Dao.StageDao;
import my.cyclingrace.Stage.Service.StageService;
import my.cyclingraceDaoService.model.StageModel;


/**
 *
 */
public class DefaultStageService implements StageService
{

	StageDao stageDao;



	/**
	 * @return the stageDao
	 */
	public StageDao getStageDao()
	{
		return stageDao;
	}



	@Required
	public void setStageDao(final StageDao stageDao)
	{
		this.stageDao = stageDao;
	}



	@Override
	public List<StageModel> getAllStage()
	{
		if (!stageDao.findAllStage().isEmpty())
		{
			final List<StageModel> stages = stageDao.findAllStage();
			return stages;
		}
		else
		{
			return null;
		}
	}



	@Override
	public List<StageModel> getStageforStageRace(final String code)
	{
		if (!stageDao.findStagebyStageRace(code).isEmpty())
		{
			final List<StageModel> stages = stageDao.findStagebyStageRace(code);
			return stages;
		}
		else
		{
			return null;
		}
	}

}
