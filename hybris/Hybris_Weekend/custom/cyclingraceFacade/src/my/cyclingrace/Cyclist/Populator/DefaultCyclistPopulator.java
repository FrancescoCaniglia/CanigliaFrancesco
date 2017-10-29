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
package my.cyclingrace.Cyclist.Populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cyclingraceDaoService.model.CyclistModel;
import my.cyclingraceFacade.data.CyclistData;


/**
 *
 */
public class DefaultCyclistPopulator implements Populator<CyclistModel, CyclistData>
{

	@Override
	public void populate(final CyclistModel source, final CyclistData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setFullName(source.getFullName());
		target.setAge(source.getAge());
		target.setNationality(source.getNationality());
		target.setTeam(source.getTeam());
		target.setWight(source.getWeight());

	}

}
