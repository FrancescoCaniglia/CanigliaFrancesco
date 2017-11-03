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
package my.cyclingrace.CyclistTeam.Dao.Impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingrace.CyclistTeam.Dao.CyclistTeamDao;
import my.cyclingraceDaoService.model.CyclistTeamModel;


/**
 *
 */
public class DefaultCyclistTeamDao extends AbstractItemDao implements CyclistTeamDao
{

	@Override
	public List<CyclistTeamModel> findAllTeam()
	{

		final String query = "SELECT {PK} FROM {CyclistTeam} ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);

		final SearchResult<CyclistTeamModel> result = getFlexibleSearchService().search(fsq);

		final List<CyclistTeamModel> teams = result.getResult();

		return teams;

	}

}
