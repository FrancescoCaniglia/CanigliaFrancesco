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
package my.cyclingrace.StageRanking.Dao.Impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingrace.StageRanking.Dao.StageRankingDao;
import my.cyclingraceDaoService.model.StageRankingModel;


/**
 *
 */
public class DefaultStageRankingDao extends AbstractItemDao implements StageRankingDao
{

	@Override
	public List<StageRankingModel> findAllStageRanking()
	{
		final String query = "SELECT {PK} FROM {StageRanking}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<StageRankingModel> result = getFlexibleSearchService().search(fsq);
		final List<StageRankingModel> stageRankings = result.getResult();
		return stageRankings;
	}


}
