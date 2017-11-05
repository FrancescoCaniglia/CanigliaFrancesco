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
package my.hospitaldaoservice.setup;

import static my.hospitaldaoservice.constants.HospitaldaoserviceConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitaldaoservice.constants.HospitaldaoserviceConstants;
import my.hospitaldaoservice.service.HospitaldaoserviceService;


@SystemSetup(extension = HospitaldaoserviceConstants.EXTENSIONNAME)
public class HospitaldaoserviceSystemSetup
{
	private final HospitaldaoserviceService hospitaldaoserviceService;

	public HospitaldaoserviceSystemSetup(final HospitaldaoserviceService hospitaldaoserviceService)
	{
		this.hospitaldaoserviceService = hospitaldaoserviceService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitaldaoserviceService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitaldaoserviceSystemSetup.class.getResourceAsStream("/hospitaldaoservice/sap-hybris-platform.png");
	}
}
