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
package my.cyclingrace.StageRace.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.StageRace.Dao.StageRaceDao;
import my.cyclingrace.StageRace.Service.StageRaceService;
import my.cyclingraceDaoService.model.StageRaceModel;


/**
 *
 */
public class DefaultStageRaceService implements StageRaceService
{

	StageRaceDao stageRaceDao;



	/**
	 * @return the stageRaceDao
	 */
	public StageRaceDao getStageRaceDao()
	{
		return stageRaceDao;
	}



	@Required
	public void setStageRaceDao(final StageRaceDao stageRaceDao)
	{
		this.stageRaceDao = stageRaceDao;
	}



	@Override
	public List<StageRaceModel> getAllStageRace()
	{
		if (!stageRaceDao.findAllStageRace().isEmpty())
		{
			final List<StageRaceModel> stageRaces = stageRaceDao.findAllStageRace();
			return stageRaces;
		}
		else
		{
			return null;
		}
	}

}
