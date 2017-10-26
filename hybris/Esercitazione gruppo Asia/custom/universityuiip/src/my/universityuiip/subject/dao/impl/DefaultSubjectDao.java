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
package my.universityuiip.subject.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.model.SubjectModel;
import my.universityuiip.subject.dao.SubjectDao;


/**
 *
 */
public class DefaultSubjectDao extends AbstractItemDao implements SubjectDao
{

	@Override
	public List<SubjectModel> findSubjectByUid(final String uid)
	{
		final String queryStr = "SELECT {PK} FROM {Subject}  WHERE {uid}> =?uid ";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("uid", uid);
		final SearchResult<SubjectModel> result = getFlexibleSearchService().search(fsq);
		final List<SubjectModel> subjectList = result.getResult();
		return subjectList;

	}

}
