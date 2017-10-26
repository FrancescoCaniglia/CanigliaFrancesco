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
package my.universityuiip.individual.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.individual.dao.IndividualDao;
import my.universityuiip.model.ProfessorModel;
import my.universityuiip.model.StudentModel;


public class DefaoultIndividualDao extends AbstractItemDao implements IndividualDao
{

	@Override
	public List<StudentModel> findStudentByCode(final String serialNumber)
	{
		final String queryStr = "SELECT {PK} FROM {Student} where {serialNumber}=?serialNumber";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("serialNumber", serialNumber);
		final SearchResult<StudentModel> result = getFlexibleSearchService().search(fsq);
		final List<StudentModel> students = result.getResult();
		return students;
	}

	@Override
	public List<ProfessorModel> fingProfessorByCode(final String serialNumber)
	{
		final String queryStr = "SELECT {PK} FROM {Professor} where {serialNumber}=?serialNumber";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("serialNumber", serialNumber);
		final SearchResult<ProfessorModel> result = getFlexibleSearchService().search(fsq);
		final List<ProfessorModel> professors = result.getResult();
		return professors;
	}

}

