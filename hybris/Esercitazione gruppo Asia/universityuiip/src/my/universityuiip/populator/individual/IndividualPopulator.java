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
package my.universityuiip.populator.individual;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.universityuiip.data.IndividualData;
import my.universityuiip.model.IndividualModel;


/**
 *
 */
public class IndividualPopulator implements Populator<IndividualModel, IndividualData>
{

	@Override
	public void populate(final IndividualModel source, final IndividualData target) throws ConversionException
	{
		target.setSerialNumber(source.getSerialNumber());
		target.setFullName(source.getFullName());
		target.setBirthDate(source.getBirthDate());

	}

}
