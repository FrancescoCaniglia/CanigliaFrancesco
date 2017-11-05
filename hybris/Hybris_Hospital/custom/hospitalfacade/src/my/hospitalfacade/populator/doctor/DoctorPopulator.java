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
package my.hospitalfacade.populator.doctor;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.hospitaldaoservice.model.DoctorModel;
import my.hospitalfacade.data.DoctorData;


/**
 *
 */
public class DoctorPopulator implements Populator<DoctorModel, DoctorData>
{

	@Override
	public void populate(final DoctorModel source, final DoctorData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setRecordNumber(source.getRecordNumber());

	}

}
