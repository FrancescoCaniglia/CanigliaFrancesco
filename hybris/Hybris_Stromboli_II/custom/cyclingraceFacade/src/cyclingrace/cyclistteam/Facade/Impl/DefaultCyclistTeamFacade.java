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
package cyclingrace.cyclistteam.Facade.Impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import cyclingrace.cyclistteam.Facade.CyclistTeamFacade;
import my.cyclingrace.CyclistTeam.Service.CyclistTeamService;
import my.cyclingraceDaoService.data.CyclistTeamData;
import my.cyclingraceDaoService.model.CyclistTeamModel;


/**
 *
 */
public class DefaultCyclistTeamFacade implements CyclistTeamFacade
{
	CyclistTeamService cyclistTeamService;
	AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> cyclistTeamConverter;



	/**
	 * @return the cyclistTeamService
	 */
	public CyclistTeamService getCyclistTeamService()
	{
		return cyclistTeamService;
	}



	@Required
	public void setCyclistTeamService(final CyclistTeamService cyclistTeamService)
	{
		this.cyclistTeamService = cyclistTeamService;
	}



	/**
	 * @return the cyclistTeamConverter
	 */
	public AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> getCyclistTeamConverter()
	{
		return cyclistTeamConverter;
	}



	@Required
	public void setCyclistTeamConverter(final AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> cyclistTeamConverter)
	{
		this.cyclistTeamConverter = cyclistTeamConverter;
	}



	@Override
	public List<CyclistTeamData> getAllCyclistTeam()
	{
		if (!cyclistTeamService.getAllCyclistTeam().isEmpty())
		{
			final List<CyclistTeamData> cyclistTeamsData = new ArrayList<CyclistTeamData>();
			for (final CyclistTeamModel ct : cyclistTeamService.getAllCyclistTeam())
			{
				cyclistTeamsData.add(cyclistTeamConverter.convert(ct));
			}
			return cyclistTeamsData;
		}
		else
		{
			return null;
		}
	}

}
