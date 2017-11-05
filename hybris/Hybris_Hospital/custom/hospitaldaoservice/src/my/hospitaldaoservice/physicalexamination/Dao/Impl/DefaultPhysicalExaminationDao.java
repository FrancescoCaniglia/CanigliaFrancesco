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
package my.hospitaldaoservice.physicalexamination.Dao.Impl;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.apache.log4j.Logger;

import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitaldaoservice.physicalexamination.Dao.PhysicalExaminationDao;


/**
 *
 */
public class DefaultPhysicalExaminationDao extends AbstractItemDao implements PhysicalExaminationDao
{

	private static final Logger LOG = Logger.getLogger(DefaultPhysicalExaminationDao.class);

	@Override
	public List<PhysicalExaminationModel> findAllPhysicalExam()
	{
		LOG.info("###LOG IN DEFAULT PHYSICAL EXAMINATION DAO ###");
		LOG.info("###FINDALLPHYSICALEXAMINATION ###");
		final String query = "SELECT {pe.PK} FROM {PhysicalExamination AS pe}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<PhysicalExaminationModel> result = getFlexibleSearchService().search(fsq);
		final List<PhysicalExaminationModel> phExaminations = result.getResult();
		return phExaminations;
	}

	@Override
	public List<PhysicalExaminationModel> findPhysicalExambyPk(final PK pk)
	{
		LOG.info("###LOG IN DEFAULT PHYSICAL EXAMINATION DAO ###");
		LOG.info("###FINDPHYSICALEXAMBYPK ###");
		final String query = "SELECT {pe.PK} FROM {PhysicalExamination AS pe} WHERE {pe.patient}=?p.pk";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("p.pk", pk);
		final SearchResult<PhysicalExaminationModel> result = getFlexibleSearchService().search(fsq);
		final List<PhysicalExaminationModel> phExaminations = result.getResult();
		return phExaminations;
	}

}
