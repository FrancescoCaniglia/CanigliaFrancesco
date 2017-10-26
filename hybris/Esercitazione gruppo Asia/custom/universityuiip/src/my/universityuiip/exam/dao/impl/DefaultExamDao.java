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
package my.universityuiip.exam.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.exam.dao.ExamDao;
import my.universityuiip.model.ExamModel;


/**
 *
 */
public class DefaultExamDao extends AbstractItemDao implements ExamDao
{

	@Override
	public List<ExamModel> findExamsByStudent(final String studentCode)
	{
		final String sql = "SELECT {e.PK} " + "FROM{Exam as e JOIN Student as s on {s.PK}={e.student}}"
				+ " WHERE {s.serialNumber}=?studentCode";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("studentCode", studentCode);
		final SearchResult<ExamModel> result = getFlexibleSearchService().search(fsq);
		final List<ExamModel> exams = result.getResult();
		return exams;
	}

}

