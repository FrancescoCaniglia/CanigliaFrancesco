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
package my.cyclingrace.CyclistTeam.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.CyclistTeam.Dao.CyclistTeamDao;
import my.cyclingrace.CyclistTeam.Service.CyclistTeamService;
import my.cyclingraceDaoService.model.CyclistTeamModel;


/**
 *
 */
public class DefaultCyclistTeamService implements CyclistTeamService
{
	CyclistTeamDao cyclistTeamDao;


	/**
	 * @return the cyclistTeamDao
	 */
	public CyclistTeamDao getCyclistTeamDao()
	{
		return cyclistTeamDao;
	}


	@Required
	public void setCyclistTeamDao(final CyclistTeamDao cyclistTeamDao)
	{
		this.cyclistTeamDao = cyclistTeamDao;
	}


	@Override
	public List<CyclistTeamModel> getAllCyclistTeam()
	{
		if (!cyclistTeamDao.findAllTeam().isEmpty())
		{
			final List<CyclistTeamModel> teams = cyclistTeamDao.findAllTeam();
			return teams;
		}
		else
		{
			return null;
		}

	}

}
