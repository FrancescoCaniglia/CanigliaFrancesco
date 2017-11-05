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
package my.hospitalfacade.populator.pysicalExamination;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaldaoservice.model.DoctorModel;
import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitalfacade.data.DoctorData;
import my.hospitalfacade.data.PhysicalExaminationData;


/**
 *
 */
public class PhysicalExaminationPopulator implements Populator<PhysicalExaminationModel, PhysicalExaminationData>
{

	private static final Logger LOG = Logger.getLogger(PhysicalExaminationPopulator.class);
	AbstractPopulatingConverter<DoctorModel, DoctorData> doctorConverter;








	/**
	 * @return the doctorConverter
	 */
	public AbstractPopulatingConverter<DoctorModel, DoctorData> getDoctorConverter()
	{
		return doctorConverter;
	}








	@Required
	public void setDoctorConverter(final AbstractPopulatingConverter<DoctorModel, DoctorData> doctorConverter)
	{
		this.doctorConverter = doctorConverter;
	}








	@Override
	public void populate(final PhysicalExaminationModel source, final PhysicalExaminationData target) throws ConversionException
	{
		LOG.info("###PHYSICAL EXAMINATION POPULATOR ###");
		target.setCode(source.getCode());
		target.setDoctor(doctorConverter.convert(source.getDoctor()));
		target.setResult(source.getResult().toString());
		target.setDate(source.getDate());

	}

}
