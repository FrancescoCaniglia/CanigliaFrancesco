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
package my.hospitaldaoservice.physicalexamination.service;

import de.hybris.platform.core.PK;

import java.util.List;

import my.hospitaldaoservice.model.PhysicalExaminationModel;


/**
 *
 */
public interface PhysicalExaminationService
{
	public List<PhysicalExaminationModel> getAllPhysicalExamination();

	public List<PhysicalExaminationModel> getPhysicalExamforPk(PK pk);

}
