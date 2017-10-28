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
package my.universityuiip.populator.professor;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.data.ProfessorData;
import my.universityuiip.data.SubjectData;
import my.universityuiip.model.ProfessorModel;
import my.universityuiip.model.SubjectModel;



/**
 *
 */
public class ProfessorPopulator implements Populator<ProfessorModel, ProfessorData>
{

	AbstractPopulatingConverter<SubjectModel, SubjectData> subjectConverter;

	@Override
	public void populate(final ProfessorModel source, final ProfessorData target) throws ConversionException
	{
		final List<SubjectData> subjectsData = new ArrayList<SubjectData>();
		final Collection<SubjectModel> subjectsModel = source.getSubjects();
		for (final SubjectModel sm : subjectsModel)
		{
			subjectsData.add(subjectConverter.convert(sm));
		}

		target.setSubjectsList(subjectsData);
	}

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



}
