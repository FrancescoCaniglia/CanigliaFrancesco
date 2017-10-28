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
package my.universityuiip.setup;

import static my.universityuiip.constants.UniversityuiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.universityuiip.constants.UniversityuiipConstants;
import my.universityuiip.service.UniversityuiipService;


@SystemSetup(extension = UniversityuiipConstants.EXTENSIONNAME)
public class UniversityuiipSystemSetup
{
	private final UniversityuiipService universityuiipService;

	public UniversityuiipSystemSetup(final UniversityuiipService universityuiipService)
	{
		this.universityuiipService = universityuiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		universityuiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return UniversityuiipSystemSetup.class.getResourceAsStream("/universityuiip/sap-hybris-platform.png");
	}
}
