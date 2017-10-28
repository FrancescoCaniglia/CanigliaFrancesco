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
package my.universityuiip.studente.facade.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.data.StudentData;
import my.universityuiip.individual.service.IndividualService;
import my.universityuiip.model.StudentModel;
import my.universityuiip.studente.facade.StudentFacade;


/**
 *
 */
public class DefaultStudentFacade implements StudentFacade
{

	IndividualService studentService;
	AbstractPopulatingConverter<StudentModel, StudentData> studentConverter;





	/**
	 * @return the studentConverter
	 */
	public AbstractPopulatingConverter<StudentModel, StudentData> getStudentConverter()
	{
		return studentConverter;
	}





	@Required
	public void setStudentConverter(final AbstractPopulatingConverter<StudentModel, StudentData> studentConverter)
	{
		this.studentConverter = studentConverter;
	}





	public IndividualService getStudentService()
	{
		return studentService;
	}





	@Required
	public void setStudentService(final IndividualService studentService)
	{
		this.studentService = studentService;
	}





	@Override
	public StudentData getStudentForSerialNumber(final String serialNumber)
	{
		final StudentData student = studentConverter.convert(studentService.getStudentForCode(serialNumber));
		return student;
	}

}
