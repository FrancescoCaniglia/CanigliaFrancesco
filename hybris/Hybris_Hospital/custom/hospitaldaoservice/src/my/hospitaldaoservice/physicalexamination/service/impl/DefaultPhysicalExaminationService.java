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
package my.hospitaldaoservice.physicalexamination.service.impl;

import de.hybris.platform.core.PK;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitaldaoservice.physicalexamination.Dao.PhysicalExaminationDao;
import my.hospitaldaoservice.physicalexamination.service.PhysicalExaminationService;


/**
 *
 */
public class DefaultPhysicalExaminationService implements PhysicalExaminationService
{

	private static final Logger LOG = Logger.getLogger(DefaultPhysicalExaminationService.class);
	PhysicalExaminationDao physicalExaminationDao;

	/**
	 * @return the physicalExaminationDao
	 */
	public PhysicalExaminationDao getPhysicalExaminationDao()
	{
		return physicalExaminationDao;
	}

	@Required
	public void setPhysicalExaminationDao(final PhysicalExaminationDao physicalExaminationDao)
	{
		this.physicalExaminationDao = physicalExaminationDao;
	}

	@Override
	public List<PhysicalExaminationModel> getAllPhysicalExamination()
	{
		LOG.info("###LOG IN DEFAULT PHUSICAL EXAMINATION SERVICE###");
		LOG.info("###GET ALL PHYSICAL EXAMINATION###");
		List<PhysicalExaminationModel> exams = new ArrayList<PhysicalExaminationModel>();
		exams = physicalExaminationDao.findAllPhysicalExam();
		return exams;

	}



	@Override
	public List<PhysicalExaminationModel> getPhysicalExamforPk(final PK pk)
	{
		LOG.info("###LOG IN DEFAULT PHUSICAL EXAMINATION SERVICE###");
		LOG.info("###GET PHUSICAL EXAM FOR PK###");
		List<PhysicalExaminationModel> exams = new ArrayList<PhysicalExaminationModel>();
		exams = physicalExaminationDao.findPhysicalExambyPk(pk);
		return exams;

	}

}
