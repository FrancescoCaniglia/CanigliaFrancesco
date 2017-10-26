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
package my.recipesuiip.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.recipesuiip.model.ToolModel;
import my.recipesuiip.tool.data.ToolData;


/**
 *
 */
public class ToolPopulator implements Populator<ToolModel, ToolData>
{

	@Override
	public void populate(final ToolModel source, final ToolData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
	}
}
