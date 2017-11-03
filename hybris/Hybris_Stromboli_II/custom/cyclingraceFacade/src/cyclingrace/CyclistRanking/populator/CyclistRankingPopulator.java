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
package cyclingrace.CyclistRanking.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cyclingraceDaoService.data.CyclistData;
import my.cyclingraceDaoService.data.CyclistRankingData;
import my.cyclingraceDaoService.data.StageRaceData;
import my.cyclingraceDaoService.model.CyclistModel;
import my.cyclingraceDaoService.model.CyclistRankingModel;
import my.cyclingraceDaoService.model.StageRaceModel;


/**
 *
 */
public class CyclistRankingPopulator implements Populator<CyclistRankingModel, CyclistRankingData>
{
	AbstractPopulatingConverter<StageRaceModel, StageRaceData> stageRaceConverter;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter;

	@Override
	public void populate(final CyclistRankingModel source, final CyclistRankingData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setTimeTotInSeconds(source.getTimeTotInSeconds());
		target.setRaceRanking(source.getRaceRanking());
		if (source.getCyclist() != null)
		{
			target.setCyclist(cyclistConverter.convert(source.getCyclist()));
		}
		if (source.getStageRace() != null)
		{
			target.setStageRace(stageRaceConverter.convert(source.getStageRace()));
		}


	}

}
