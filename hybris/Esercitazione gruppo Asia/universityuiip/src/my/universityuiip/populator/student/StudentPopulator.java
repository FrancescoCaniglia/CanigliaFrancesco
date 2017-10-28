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
package my.universityuiip.populator.student;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import my.universityuiip.data.ExamData;
import my.universityuiip.data.StudentData;
import my.universityuiip.model.ExamModel;
import my.universityuiip.model.StudentModel;




/**
 *
 */
public class StudentPopulator implements Populator<StudentModel, StudentData>
{


	AbstractPopulatingConverter<ExamModel, ExamData> examConverter;

	/**
	 * @return the examConverter
	 */
	public AbstractPopulatingConverter<ExamModel, ExamData> getExamConverter()
	{
		return examConverter;
	}

	/**
	 * @param examConverter
	 *           the examConverter to set
	 */
	public void setExamConverter(final AbstractPopulatingConverter<ExamModel, ExamData> examConverter)
	{
		this.examConverter = examConverter;
	}

	@Override
	public void populate(final StudentModel source, final StudentData target) throws ConversionException
	{
		final List<ExamData> examsData = new ArrayList<ExamData>();
		final Collection<ExamModel> examsModel = source.getExams();
		for (final ExamModel em : examsModel)
		{
			examsData.add(examConverter.convert(em));
		}

		target.setExamsList(examsData);

	}

}
