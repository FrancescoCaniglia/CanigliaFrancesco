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
package cyclingrace.cyclistteam.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import my.cyclingraceDaoService.data.CyclistData;
import my.cyclingraceDaoService.data.CyclistTeamData;
import my.cyclingraceDaoService.data.ManagerData;
import my.cyclingraceDaoService.model.CyclistModel;
import my.cyclingraceDaoService.model.CyclistTeamModel;
import my.cyclingraceDaoService.model.ManagerModel;


/**
 *
 */
public class CyclistTeamPopulator implements Populator<CyclistTeamModel, CyclistTeamData>
{
	AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter;

	@Override
	public void populate(final CyclistTeamModel source, final CyclistTeamData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setYear(source.getYear());
		target.setCycleModel(source.getCycleModel());
		target.setNationality(source.getNationality());
		if (source.getManager() != null)
		{
			target.setManager(managerConverter.convert(source.getManager()));
		}
		final Collection<CyclistModel> cyclistModel = source.getCyclists();
		if (!cyclistModel.isEmpty())
		{
			final List<CyclistData> cd = new ArrayList<CyclistData>();
			for (final CyclistModel cm : cyclistModel)
			{
				cd.add(cyclistConverter.convert(cm));
			}
			target.setCyclistsList(cd);
		}



	}

}
