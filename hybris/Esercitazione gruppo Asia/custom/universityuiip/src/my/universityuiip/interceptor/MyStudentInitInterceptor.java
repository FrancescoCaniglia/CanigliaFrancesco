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
package my.universityuiip.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.UUID;

import my.universityuiip.model.StudentModel;


/**
 *
 */
public class MyStudentInitInterceptor implements InitDefaultsInterceptor<StudentModel>
{

	@Override
	public void onInitDefaults(final StudentModel student, final InterceptorContext ctx) throws InterceptorException
	{
		//nella creazione di un Student setto automaticamente il campo serialNumber ad un uid generato in modo random
		final UUID randomUid = UUID.randomUUID();
		final String sUid = randomUid.toString();
		student.setSerialNumber(sUid);
	}

}

