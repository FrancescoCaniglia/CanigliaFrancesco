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
package my.universityuiip.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.exam.dao.ExamDao;
import my.universityuiip.exam.service.ExamService;
import my.universityuiip.model.ExamModel;


/**
 *
 */
public class DefaultExamService implements ExamService
{
	public ExamDao examDao;

	/**
	 * @return the examDao
	 */
	public ExamDao getExamDao()
	{
		return examDao;
	}

	/**
	 * @param examDao
	 *           the examDao to set
	 */
	@Required
	public void setExamDao(final ExamDao examDao)
	{
		this.examDao = examDao;
	}

	@Override
	public List<ExamModel> getExamsForStudent(final String studentCode)
	{
		final List<ExamModel> exams = examDao.findExamsByStudent(studentCode);
		if (exams.isEmpty())
		{
			System.out.println("non ci sono risultati");
			return null;
		}
		else
		{
			return exams;

		}
	}


}

