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
package my.cyclingrace.Manager.Dao.Impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingrace.Manager.Dao.ManagerDao;
import my.cyclingraceDaoService.model.ManagerModel;


/**
 *
 */
public class DefaultManagerDao extends AbstractItemDao implements ManagerDao
{

	@Override
	public List<ManagerModel> findManagersByCode(final String code)
	{
		final String query = "SELECT {m.name, m.surname} FROM {Manager as m} JOIN {CyclistTeam as t} ON {t.manager}={m.PK}} WHERE {t.code}=?code";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);

		fsq.addQueryParameter("code", code);

		final SearchResult<ManagerModel> result = getFlexibleSearchService().search(fsq);

		final List<ManagerModel> managers = result.getResult();

		return managers;

	}

}
