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
package cyclingrace.manager.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cyclingraceDaoService.data.ManagerData;
import my.cyclingraceDaoService.model.ManagerModel;


/**
 *
 */
public class ManagerPopulator implements Populator<ManagerModel, ManagerData>

{

	@Override
	public void populate(final ManagerModel source, final ManagerData target) throws ConversionException
	{
		target.setCode(source.getCode());

	}

}
