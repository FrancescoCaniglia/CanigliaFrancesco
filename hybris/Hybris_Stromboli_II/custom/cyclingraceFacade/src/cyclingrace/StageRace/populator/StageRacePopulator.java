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
package cyclingrace.StageRace.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import my.cyclingraceDaoService.data.StageData;
import my.cyclingraceDaoService.data.StageRaceData;
import my.cyclingraceDaoService.model.StageModel;
import my.cyclingraceDaoService.model.StageRaceModel;


/**
 *
 */
public class StageRacePopulator implements Populator<StageRaceModel, StageRaceData>
{
	AbstractPopulatingConverter<StageModel, StageData> stageConverter;

	@Override
	public void populate(final StageRaceModel source, final StageRaceData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setEndDate(source.getEndDate());
		target.setEdition(source.getEdition());
		final Collection<StageModel> stagesModel = source.getStages();
		if (!stagesModel.isEmpty())
		{
			final List<StageData> stagesData = new ArrayList<StageData>();
			for (final StageModel sm : stagesModel)
			{
				stagesData.add(stageConverter.convert(sm));
			}
			target.setStagesList(stagesData);
		}

	}

}
