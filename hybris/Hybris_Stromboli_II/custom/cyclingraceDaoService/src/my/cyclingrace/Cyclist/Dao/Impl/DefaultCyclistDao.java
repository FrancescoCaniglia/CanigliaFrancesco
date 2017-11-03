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
package my.cyclingrace.Cyclist.Dao.Impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingrace.Cyclist.Dao.CyclistDao;
import my.cyclingraceDaoService.model.CyclistModel;


/**
 *
 */
public class DefaultCyclistDao extends AbstractItemDao implements CyclistDao
{

	@Override
	public List<CyclistModel> findCyclistsByTeam(final String code)
	{
		final String query = "SELECT {c.name, c.surname} FROM {Cyclist as c} JOIN  {CyclistTeam as t} ON {t.cyclist}={c.PK}} WHERE {t.code}=?code";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);

		fsq.addQueryParameter("code", code);

		final SearchResult<CyclistModel> result = getFlexibleSearchService().search(fsq);

		final List<CyclistModel> cyclists = result.getResult();

		return cyclists;

	}

}
