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
package my.cyclingrace.EventListner;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import java.util.List;

import my.cyclingrace.CyclistRanking.Dao.CyclistRankingDao;
import my.cyclingraceDaoService.model.CyclistRankingModel;


/**
 *
 */
public class CronJobListner extends AbstractEventListener<CronJobEvent>
{

	private CyclistRankingDao cyclistRankingDao;

	@Override
	protected void onEvent(final CronJobEvent cronjob)
	{

		final List<CyclistRankingModel> cyclistRankings = cyclistRankingDao.findAllCyclistRankingOrdered();

		//MISS THE CODE FOR CSV EXPORT


	}

}
