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
package my.hospitalfacade.populator.hospitalPerson;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;

import my.hospitaldaoservice.model.HospitalPersonModel;
import my.hospitalfacade.data.HospitalPersonData;


/**
 *
 */
public class HospitalPersonPopulator implements Populator<HospitalPersonModel, HospitalPersonData>
{

	private static final Logger LOG = Logger.getLogger(HospitalPersonPopulator.class);

	@Override
	public void populate(final HospitalPersonModel source, final HospitalPersonData target) throws ConversionException
	{
		LOG.info("###HOSPITAL PERSON POPULATOR ###");
		target.setCf(source.getCf());
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setBirthDate(source.getBirthDate());
		target.setBirthPlace(source.getBirthPlace());
		target.setGender(source.getGender().toString());

	}

}
