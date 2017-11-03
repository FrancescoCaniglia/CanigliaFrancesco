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
package my.cyclingrace.Interceptor.Stage;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Calendar;
import java.util.Date;

import my.cyclingraceDaoService.model.StageModel;


/**
 *
 */
public class StageInitInterceptor implements InitDefaultsInterceptor<StageModel>
{



	@Override
	public void onInitDefaults(final StageModel stage, final InterceptorContext ctx) throws InterceptorException
	{

		System.out.println("Ciao sono nell'Interceptor");
		final Calendar today = Calendar.getInstance();
		final int day = today.get(Calendar.DAY_OF_MONTH) - 1;
		final int month = today.get(Calendar.MONTH);
		final int year = today.get(Calendar.YEAR);

		today.set(year, month, day);
		final Date yesterday = today.getTime();
		stage.setStartdate(yesterday);


	}

}
