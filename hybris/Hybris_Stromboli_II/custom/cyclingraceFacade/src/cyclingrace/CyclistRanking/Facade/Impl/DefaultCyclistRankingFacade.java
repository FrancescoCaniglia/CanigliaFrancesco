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
package cyclingrace.CyclistRanking.Facade.Impl;


import cyclingrace.CyclistRanking.Facade.CyclistRankingFacade;
import my.cyclingrace.CyclistRanking.Service.CyclistRankingService;



//TODO aggiusta dopo i converter

public class DefaultCyclistRankingFacade implements CyclistRankingFacade
{

	CyclistRankingService cyclistRankingService;


	@Override
	public void getCyclistRankingForStageRace(final String code)
	{
		if (!cyclistRankingService.getCyclistRankingForStageRace(code).isEmpty())
		{
			//final List<CyclistRankingData> cyclistRankForStageRace = cyclistRankingService.getCyclistRankingForStageRace(code);
			//return cyclistRankForStageRace;
		}
		else
		{
			//return null;
		}
	}

	@Override
	public void getAllCyclistRankingOrdered()
	{
		if (!cyclistRankingService.getAllCyclistRankingOrdered().isEmpty())
		{
			//final List<CyclistRankingData> cyclistRankOrdered = cyclistRankingService.getAllCyclistRankingOrdered();
			//return cyclistRankOrdered;
		}
		else
		{
			//return null;
		}
	}

}
