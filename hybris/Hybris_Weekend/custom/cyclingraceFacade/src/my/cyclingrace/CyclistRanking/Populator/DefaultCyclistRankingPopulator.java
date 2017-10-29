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
package my.cyclingrace.CyclistRanking.Populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingraceDaoService.model.CyclistModel;
import my.cyclingraceDaoService.model.CyclistRankingModel;
import my.cyclingraceDaoService.model.StageRaceModel;
import my.cyclingraceFacade.data.CyclistData;
import my.cyclingraceFacade.data.CyclistRankingData;
import my.cyclingraceFacade.data.StageRaceData;




/**
 *
 */
public class DefaultCyclistRankingPopulator implements Populator<CyclistRankingModel, CyclistRankingData>
{

	AbstractPopulatingConverter<StageRaceModel, StageRaceData> stageRaceConverter;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter;



	/**
	 * @return the stageRaceConverter
	 */
	public AbstractPopulatingConverter<StageRaceModel, StageRaceData> getStageRaceConverter()
	{
		return stageRaceConverter;
	}



	@Required
	public void setStageRaceConverter(final AbstractPopulatingConverter<StageRaceModel, StageRaceData> stageRaceConverter)
	{
		this.stageRaceConverter = stageRaceConverter;
	}



	/**
	 * @return the cyclistConverter
	 */
	public AbstractPopulatingConverter<CyclistModel, CyclistData> getCyclistConverter()
	{
		return cyclistConverter;
	}



	@Required
	public void setCyclistConverter(final AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter)
	{
		this.cyclistConverter = cyclistConverter;
	}



	@Override
	public void populate(final CyclistRankingModel source, final CyclistRankingData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setTimeTotInSeconds(source.getTimeTotInSeconds());
		target.setRaceRanking(source.getRaceRanking());
		target.setStageRace(stageRaceConverter.convert(source.getStageRace()));
		target.setCyclist(cyclistConverter.convert(source.getCyclist()));

	}

}
