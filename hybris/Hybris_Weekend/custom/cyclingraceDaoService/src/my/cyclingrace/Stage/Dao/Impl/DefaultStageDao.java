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
package my.cyclingrace.Stage.Dao.Impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingrace.Stage.Dao.StageDao;
import my.cyclingraceDaoService.model.StageModel;


/**
 *
 */
public class DefaultStageDao extends AbstractItemDao implements StageDao
{

	public List<StageModel> findAllStage()
	{
		final String query = "SELECT {s.PK} FROM {Stage AS s}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<StageModel> result = getFlexibleSearchService().search(fsq);
		final List<StageModel> stages = result.getResult();
		return stages;



	}

}
