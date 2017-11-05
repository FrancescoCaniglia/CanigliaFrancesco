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
package my.hospitalfacade.physicalexamination.facade;

import de.hybris.platform.core.PK;

import java.util.List;

import my.hospitalfacade.data.PhysicalExaminationData;


/**
 *
 */
public interface PhysicalExaminationFacade
{
	public List<PhysicalExaminationData> getAllPhysicalExamination();

	public List<PhysicalExaminationData> getPhysicalExamforPk(final PK pk);
}
