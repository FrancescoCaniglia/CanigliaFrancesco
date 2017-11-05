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
package my.hospitalfacade.physicalexamination.facade.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.core.PK;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitaldaoservice.physicalexamination.service.PhysicalExaminationService;
import my.hospitalfacade.data.PhysicalExaminationData;
import my.hospitalfacade.physicalexamination.facade.PhysicalExaminationFacade;


/**
 *
 */
public class DefaultPhysicalExaminationFacade implements PhysicalExaminationFacade
{
	private static final Logger LOG = Logger.getLogger(DefaultPhysicalExaminationFacade.class);
	AbstractPopulatingConverter<PhysicalExaminationModel, PhysicalExaminationData> phExaminationConverter;
	PhysicalExaminationService phExaminationService;




	/**
	 * @return the phExaminationConverter
	 */
	public AbstractPopulatingConverter<PhysicalExaminationModel, PhysicalExaminationData> getPhExaminationConverter()
	{
		return phExaminationConverter;
	}

	@Required
	public void setPhExaminationConverter(
			final AbstractPopulatingConverter<PhysicalExaminationModel, PhysicalExaminationData> phExaminationConverter)
	{
		this.phExaminationConverter = phExaminationConverter;
	}

	/**
	 * @return the phExaminationService
	 */
	public PhysicalExaminationService getPhExaminationService()
	{
		return phExaminationService;
	}

	@Required
	public void setPhExaminationService(final PhysicalExaminationService phExaminationService)
	{
		this.phExaminationService = phExaminationService;
	}

	@Override
	public List<PhysicalExaminationData> getAllPhysicalExamination()
	{
		LOG.info("###LOG IN DEFAULT PHYSICAL EXAMINATION FACADE");
		LOG.info("### GET ALL PHYSICAL EXAMINATION ###");
		final Collection<PhysicalExaminationModel> examsModel = phExaminationService.getAllPhysicalExamination();
		final List<PhysicalExaminationData> examsData = new ArrayList<PhysicalExaminationData>();
		for (final PhysicalExaminationModel pem : examsModel)
		{
			examsData.add(phExaminationConverter.convert(pem));
		}
		return examsData;
	}

	@Override
	public List<PhysicalExaminationData> getPhysicalExamforPk(final PK pk)
	{
		LOG.info("###LOG IN DEFAULT PHYSICAL EXAMINATION FACADE");
		LOG.info("### GET HYSICAL EXAMINATION FOR PK ###");
		final Collection<PhysicalExaminationModel> examsModel = phExaminationService.getPhysicalExamforPk(pk);
		final List<PhysicalExaminationData> examsData = new ArrayList<PhysicalExaminationData>();
		for (final PhysicalExaminationModel pem : examsModel)
		{
			examsData.add(phExaminationConverter.convert(pem));
		}
		return examsData;
	}

}
