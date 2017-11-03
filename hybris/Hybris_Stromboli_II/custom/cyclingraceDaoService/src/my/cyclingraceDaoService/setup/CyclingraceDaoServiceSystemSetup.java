/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.cyclingraceDaoService.setup;

import static my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.service.CyclingraceDaoServiceService;


@SystemSetup(extension = CyclingraceDaoServiceConstants.EXTENSIONNAME)
public class CyclingraceDaoServiceSystemSetup
{
	private final CyclingraceDaoServiceService cyclingraceDaoServiceService;

	public CyclingraceDaoServiceSystemSetup(final CyclingraceDaoServiceService cyclingraceDaoServiceService)
	{
		this.cyclingraceDaoServiceService = cyclingraceDaoServiceService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclingraceDaoServiceService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclingraceDaoServiceSystemSetup.class.getResourceAsStream("/cyclingraceDaoService/sap-hybris-platform.png");
	}
}
