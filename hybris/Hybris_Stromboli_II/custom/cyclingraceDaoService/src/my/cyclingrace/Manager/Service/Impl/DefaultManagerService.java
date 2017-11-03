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
package my.cyclingrace.Manager.Service.Impl;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.Manager.Dao.ManagerDao;
import my.cyclingrace.Manager.Service.ManagerService;
import my.cyclingraceDaoService.model.ManagerModel;


/**
 *
 */
public class DefaultManagerService implements ManagerService
{

	ManagerDao managerDao;


	/**
	 * @return the managerDao
	 */
	public ManagerDao getManagerDao()
	{
		return managerDao;
	}


	@Required
	public void setManagerDao(final ManagerDao managerDao)
	{
		this.managerDao = managerDao;
	}


	@Override
	public ManagerModel getManagerForCode(final String code)
	{
		if (!managerDao.findManagersByCode(code).isEmpty())
		{
			final ManagerModel manager = managerDao.findManagersByCode(code).get(0);
			return manager;
		}
		else
		{
			return null;
		}

	}

}
