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
package my.cyclingrace.StageRace.Populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingraceDaoService.model.StageModel;
import my.cyclingraceDaoService.model.StageRaceModel;
import my.cyclingraceFacade.data.StageData;
import my.cyclingraceFacade.data.StageRaceData;




/**
 *
 */
public class DefaultStageRacePopulator implements Populator<StageRaceModel, StageRaceData>
{
	AbstractPopulatingConverter<StageModel, StageData> stageConverter;



	/**
	 * @return the stageConverter
	 */
	public AbstractPopulatingConverter<StageModel, StageData> getStageConverter()
	{
		return stageConverter;
	}



	@Required
	public void setStageConverter(final AbstractPopulatingConverter<StageModel, StageData> stageConverter)
	{
		this.stageConverter = stageConverter;
	}



	@Override
	public void populate(final StageRaceModel source, final StageRaceData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setYear(source.getYear());
		target.setEdition(source.getEdition());
		if (!source.getStages().isEmpty())
		{
			final List<StageData> stageDataList = new ArrayList<StageData>();
			for (final StageModel sm : source.getStages())
			{
				stageDataList.add(stageConverter.convert(sm));
			}
			target.setStagesList(stageDataList);
		}
	}

}
