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
package my.cyclingraceFrontend.setup;

import static my.cyclingraceFrontend.constants.CyclingraceFrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclingraceFrontend.constants.CyclingraceFrontendConstants;
import my.cyclingraceFrontend.service.CyclingraceFrontendService;


@SystemSetup(extension = CyclingraceFrontendConstants.EXTENSIONNAME)
public class CyclingraceFrontendSystemSetup
{
	private final CyclingraceFrontendService cyclingraceFrontendService;

	public CyclingraceFrontendSystemSetup(final CyclingraceFrontendService cyclingraceFrontendService)
	{
		this.cyclingraceFrontendService = cyclingraceFrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclingraceFrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclingraceFrontendSystemSetup.class.getResourceAsStream("/cyclingraceFrontend/sap-hybris-platform.png");
	}
}
