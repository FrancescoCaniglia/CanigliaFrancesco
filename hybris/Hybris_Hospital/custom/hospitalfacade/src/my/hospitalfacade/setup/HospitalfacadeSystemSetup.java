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
package my.hospitalfacade.setup;

import static my.hospitalfacade.constants.HospitalfacadeConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitalfacade.constants.HospitalfacadeConstants;
import my.hospitalfacade.service.HospitalfacadeService;


@SystemSetup(extension = HospitalfacadeConstants.EXTENSIONNAME)
public class HospitalfacadeSystemSetup
{
	private final HospitalfacadeService hospitalfacadeService;

	public HospitalfacadeSystemSetup(final HospitalfacadeService hospitalfacadeService)
	{
		this.hospitalfacadeService = hospitalfacadeService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitalfacadeService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitalfacadeSystemSetup.class.getResourceAsStream("/hospitalfacade/sap-hybris-platform.png");
	}
}
