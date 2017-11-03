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
package cyclingrace.person.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cyclingraceDaoService.data.PersonData;
import my.cyclingraceDaoService.model.PersonModel;


/**
 *
 */
public class PersonPopulator implements Populator<PersonModel, PersonData>
{

	@Override
	public void populate(final PersonModel source, final PersonData target) throws ConversionException
	{
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setBirthDate(source.getBirthDate());
		target.setNationality(source.getNationality());

	}


}
