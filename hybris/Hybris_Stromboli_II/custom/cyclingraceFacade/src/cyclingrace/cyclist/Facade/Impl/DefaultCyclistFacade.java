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
package cyclingrace.cyclist.Facade.Impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import cyclingrace.cyclist.Facade.CyclistFacade;
import my.cyclingrace.Cyclist.Service.CyclistService;
import my.cyclingraceDaoService.data.CyclistData;
import my.cyclingraceDaoService.model.CyclistModel;



/**
 *
 */
public class DefaultCyclistFacade implements CyclistFacade
{
	CyclistService cyclistService;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter;



	/**
	 * @return the cyclistService
	 */
	public CyclistService getCyclistService()
	{
		return cyclistService;
	}



	@Required
	public void setCyclistService(final CyclistService cyclistService)
	{
		this.cyclistService = cyclistService;
	}



	/**
	 * @return the cyclistConverter
	 */
	public AbstractPopulatingConverter<CyclistModel, CyclistData> getCyclistConverter()
	{
		return cyclistConverter;
	}



	@Required
	public void setCyclistConverter(final AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter)
	{
		this.cyclistConverter = cyclistConverter;
	}



	@Override
	public List<CyclistData> getCyclistForTeam(final String code)
	{
		if (!cyclistService.getCyclistsForTeam(code).isEmpty())
		{
			final List<CyclistData> cyclistsData = new ArrayList<CyclistData>();
			for (final CyclistModel cm : cyclistService.getCyclistsForTeam(code))
			{
				cyclistsData.add(cyclistConverter.convert(cm));
			}
			return cyclistsData;
		}
		else
		{
			return null;
		}
	}

}
