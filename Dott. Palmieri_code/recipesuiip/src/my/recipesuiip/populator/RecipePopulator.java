package my.recipesuiip.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.recipesuiip.model.RecipeModel;
import my.recipesuiip.model.ToolModel;
import my.recipesuiip.recipe.data.RecipeData;
import my.recipesuiip.tool.data.ToolData;


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

/**
 *
 */
public class RecipePopulator implements Populator<RecipeModel, RecipeData>
{

	AbstractPopulatingConverter<ToolModel, ToolData> toolConverter;

	@Override
	public void populate(final RecipeModel source, final RecipeData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
		//...



		final ToolData toolData = toolConverter.convert(source.getTool());
		//	final ToolModel toolModel = source.getTool();
		//	toolData.setId(toolModel.getId());
		//	toolData.setName(toolModel.getName());
		target.setTool(toolData);
	}

	public AbstractPopulatingConverter<ToolModel, ToolData> getToolConverter()
	{
		return toolConverter;
	}

	@Required
	public void setToolConverter(final AbstractPopulatingConverter<ToolModel, ToolData> toolConverter)
	{
		this.toolConverter = toolConverter;
	}



}
