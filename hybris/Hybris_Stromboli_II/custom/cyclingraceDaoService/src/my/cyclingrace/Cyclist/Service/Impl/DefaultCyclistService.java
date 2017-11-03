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
package my.cyclingrace.Cyclist.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.Cyclist.Dao.CyclistDao;
import my.cyclingrace.Cyclist.Service.CyclistService;
import my.cyclingraceDaoService.model.CyclistModel;


/**
 *
 */
public class DefaultCyclistService implements CyclistService
{
	CyclistDao cyclistDao;


	/**
	 * @return the cyclistDao
	 */
	public CyclistDao getCyclistDao()
	{
		return cyclistDao;
	}


	@Required
	public void setCyclistDao(final CyclistDao cyclistDao)
	{
		this.cyclistDao = cyclistDao;
	}


	@Override
	public List<CyclistModel> getCyclistsForTeam(final String code)
	{
		if (!cyclistDao.findCyclistsByTeam(code).isEmpty())
		{
			final List<CyclistModel> cyclists = cyclistDao.findCyclistsByTeam(code);
			return cyclists;
		}
		else
		{
			return null;
		}

	}

}
