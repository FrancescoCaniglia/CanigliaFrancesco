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
package my.universityuiip.populator.subject;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.universityuiip.data.SubjectData;
import my.universityuiip.model.SubjectModel;


/**
 *
 */
public class SubjectPopulator implements Populator<SubjectModel, SubjectData>
{

	@Override
	public void populate(final SubjectModel source, final SubjectData target) throws ConversionException
	{
		target.setUid(source.getUid());
		target.setName(source.getName());
		target.setProgram(source.getProgram());
	}
}

