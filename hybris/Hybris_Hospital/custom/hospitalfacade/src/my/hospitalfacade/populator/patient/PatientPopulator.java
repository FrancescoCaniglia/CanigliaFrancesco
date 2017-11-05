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
package my.hospitalfacade.populator.patient;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaldaoservice.model.DoctorModel;
import my.hospitaldaoservice.model.PatientModel;
import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitalfacade.data.DoctorData;
import my.hospitalfacade.data.PatientData;
import my.hospitalfacade.data.PhysicalExaminationData;


/**
 *
 */
public class PatientPopulator implements Populator<PatientModel, PatientData>
{
	private static final Logger LOG = Logger.getLogger(PatientPopulator.class);
	AbstractPopulatingConverter<DoctorModel, DoctorData> doctorConverter;

	AbstractPopulatingConverter<PhysicalExaminationModel, PhysicalExaminationData> phExaminationConverter;




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




	@Required
	public AbstractPopulatingConverter<PhysicalExaminationModel, PhysicalExaminationData> getPhExaminationConverter()
	{
		return phExaminationConverter;
	}




	/**
	 * @param phExaminationConverter
	 *           the phExaminationConverter to set
	 */
	public void setPhExaminationConverter(
			final AbstractPopulatingConverter<PhysicalExaminationModel, PhysicalExaminationData> phExaminationConverter)
	{
		this.phExaminationConverter = phExaminationConverter;
	}




	@Override
	public void populate(final PatientModel source, final PatientData target) throws ConversionException
	{
		LOG.info("###PATIENT POPULATOR ###");
		target.setCode(source.getCode());
		target.setEnterDate(source.getEnterDate());
		target.setEscDate(source.getEscDate());
		target.setDays(source.getDays());
		target.setRecoveryStatus(source.getRecoveryStatus().toString());

		target.setDoctor(doctorConverter.convert(source.getDoctor()));
		final Collection<PhysicalExaminationModel> phExaminations = source.getExaminations();
		if (!phExaminations.isEmpty())
		{

			final List<PhysicalExaminationData> examsData = new ArrayList<PhysicalExaminationData>();
			for (final PhysicalExaminationModel pem : phExaminations)
			{
				examsData.add(phExaminationConverter.convert(pem));
			}
			target.setExamsList(examsData);


		}

	}

}
