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
package my.cyclingraceFacade.setup;

import static my.cyclingraceFacade.constants.CyclingraceFacadeConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclingraceFacade.constants.CyclingraceFacadeConstants;
import my.cyclingraceFacade.service.CyclingraceFacadeService;


@SystemSetup(extension = CyclingraceFacadeConstants.EXTENSIONNAME)
public class CyclingraceFacadeSystemSetup
{
	private final CyclingraceFacadeService cyclingraceFacadeService;

	public CyclingraceFacadeSystemSetup(final CyclingraceFacadeService cyclingraceFacadeService)
	{
		this.cyclingraceFacadeService = cyclingraceFacadeService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclingraceFacadeService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclingraceFacadeSystemSetup.class.getResourceAsStream("/cyclingraceFacade/sap-hybris-platform.png");
	}
}
