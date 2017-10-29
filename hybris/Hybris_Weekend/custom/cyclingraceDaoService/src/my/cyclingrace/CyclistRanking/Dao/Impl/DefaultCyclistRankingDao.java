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
package my.cyclingrace.CyclistRanking.Dao.Impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingrace.CyclistRanking.Dao.CyclistRankingDao;
import my.cyclingraceDaoService.model.CyclistRankingModel;


/**
 *
 */
public class DefaultCyclistRankingDao extends AbstractItemDao implements CyclistRankingDao
{

	@Override
	public List<CyclistRankingModel> findAllCyclistRankingOrdered()
	{

		final String query = "SELECT {cr.PK} FROM {CyclistRanking AS cr} ORDER BY {cr.stageRace} ASC, {cr.raceRanking} ASC";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<CyclistRankingModel> result = getFlexibleSearchService().search(fsq);
		final List<CyclistRankingModel> cyclistRankings = result.getResult();
		return cyclistRankings;
	}

	@Override
	public List<CyclistRankingModel> findCyclistRankingByStageRace(final String code)
	{
		final String query = "SELECT {cr.PK} FROM {CyclistRanking AS cr} WHERE {cr.stageRace} = ?code ORDER BY {cr.raceRanking} ASC";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("code", code);
		final SearchResult<CyclistRankingModel> result = getFlexibleSearchService().search(fsq);
		final List<CyclistRankingModel> cyclistRankByStageRace = result.getResult();
		return cyclistRankByStageRace;

	}



}
