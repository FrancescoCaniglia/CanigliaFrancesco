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
package my.cyclingrace.Stage.Populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingraceDaoService.model.StageModel;
import my.cyclingraceDaoService.model.StageRankingModel;
import my.cyclingraceFacade.data.StageData;
import my.cyclingraceFacade.data.StageRankingData;



/**
 *
 */
public class DefaultStagePopulator implements Populator<StageModel, StageData>
{

	AbstractPopulatingConverter<StageRankingModel, StageRankingData> stageRankingConverter;



	/**
	 * @return the stageRankingConverter
	 */
	public AbstractPopulatingConverter<StageRankingModel, StageRankingData> getStageRankingConverter()
	{
		return stageRankingConverter;
	}



	@Required
	public void setStageRankingConverter(
			final AbstractPopulatingConverter<StageRankingModel, StageRankingData> stageRankingConverter)
	{
		this.stageRankingConverter = stageRankingConverter;
	}



	@Override
	public void populate(final StageModel source, final StageData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setDate(source.getDate());
		target.setStart(source.getStart());
		target.setEnd(source.getEnd());
		target.setKm(source.getKm());

		if (!source.getStageRankings().isEmpty())
		{
			final List<StageRankingData> stageRankingDataList = new ArrayList<StageRankingData>();
			for (final StageRankingModel srm : source.getStageRankings())
			{
				stageRankingDataList.add(stageRankingConverter.convert(srm));
			}
			target.setStageRankingsList(stageRankingDataList);
		}

	}

}
