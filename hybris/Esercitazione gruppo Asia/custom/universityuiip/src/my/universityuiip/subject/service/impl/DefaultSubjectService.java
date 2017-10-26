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
package my.universityuiip.subject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.SubjectModel;
import my.universityuiip.subject.dao.SubjectDao;
import my.universityuiip.subject.service.SubjectService;


public class DefaultSubjectService implements SubjectService
{

	SubjectDao subjectDao;


	public SubjectDao getSubjectDao()
	{
		return subjectDao;
	}

	@Required
	public void setSubjectDao(final SubjectDao subjectDao)
	{
		this.subjectDao = subjectDao;
	}

	public SubjectModel getSubjectForUid(final String uid)
	{
		final List<SubjectModel> subjectList = subjectDao.findSubjectByUid(uid);

		if (subjectList.isEmpty())
		{
			return null;
		}
		else
		{
			if (subjectList.size() > 1)
			{
				System.out.println(
						"C'è qualcosa che non va! Sono stati trovati più subject con lo stesso uid! Dovrebbe essercene solo uno!");
				return null;
			}
			else
			{
				final SubjectModel subject = subjectList.get(0);
				return subject;
			}

		}
	}
}

