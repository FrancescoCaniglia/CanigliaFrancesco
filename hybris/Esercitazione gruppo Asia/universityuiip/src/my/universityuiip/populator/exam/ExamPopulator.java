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
package my.universityuiip.populator.exam;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.data.ExamData;
import my.universityuiip.data.SubjectData;
import my.universityuiip.model.ExamModel;
import my.universityuiip.model.SubjectModel;


/**
 *
 */
public class ExamPopulator implements Populator<ExamModel, ExamData>
{

	AbstractPopulatingConverter<SubjectModel, SubjectData> subjectConverter;


	/**
	 * @return the subjectConverter
	 */
	public AbstractPopulatingConverter<SubjectModel, SubjectData> getSubjectConverter()
	{
		return subjectConverter;
	}

	@Required
	public void setSubjectConverter(final AbstractPopulatingConverter<SubjectModel, SubjectData> subjectConverter)
	{
		this.subjectConverter = subjectConverter;
	}



	@Override
	public void populate(final ExamModel source, final ExamData target) throws ConversionException
	{
		target.setUid(source.getUid());
		target.setGrade(source.getGrade());
		if (source.getResult().getCode() != null)
		{
			target.setResult(source.getResult().getCode());
		}
		final SubjectData subjectData = subjectConverter.convert(source.getSubject());
		target.setSubject(subjectData);


	}

}
