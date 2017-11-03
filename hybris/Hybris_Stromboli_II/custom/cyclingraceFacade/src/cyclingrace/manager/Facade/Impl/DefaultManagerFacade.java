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
package cyclingrace.manager.Facade.Impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import cyclingrace.manager.Facade.ManagerFacade;
import my.cyclingrace.Manager.Service.ManagerService;
import my.cyclingraceDaoService.data.ManagerData;
import my.cyclingraceDaoService.model.ManagerModel;



/**
 *
 */
public class DefaultManagerFacade implements ManagerFacade
{

	ManagerService managerService;
	AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter;



	/**
	 * @return the managerConverter
	 */
	public AbstractPopulatingConverter<ManagerModel, ManagerData> getManagerConverter()
	{
		return managerConverter;
	}



	@Required
	public void setManagerConverter(final AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter)
	{
		this.managerConverter = managerConverter;
	}



	/**
	 * @return the managerService
	 */
	public ManagerService getManagerService()
	{
		return managerService;
	}



	@Required
	public void setManagerService(final ManagerService managerService)
	{
		this.managerService = managerService;
	}



	@Override
	public List<ManagerData> getManagersForCode(final String code)
	{
		if (!managerService.getManagersForCode(code).isEmpty())
		{
			final List<ManagerData> managersData = new ArrayList<ManagerData>();
			for (final ManagerModel mm : managerService.getManagersForCode(code))
			{
				managersData.add(managerConverter.convert(mm));
			}
			return managersData;
		}
		else
		{
			return null;
		}
	}

}
