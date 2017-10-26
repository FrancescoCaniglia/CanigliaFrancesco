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

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import my.universityuiip.enums.ExamResultEnum;
import my.universityuiip.model.ExamModel;


/**
 *
 */
public class MyExamPrepareInterceptor implements PrepareInterceptor<ExamModel>
{

	@Override
	public void onPrepare(final ExamModel exam, final InterceptorContext ctx) throws InterceptorException
	{
		//dopo aver inserito un valore in Exam controllo il grade
		//se è maggiore di 17 setto il  ExamResultEnum a Passed
		//altrimenti lo setto a Reject
		if (exam.getGrade().intValue() > 17)
		{
			exam.setResult(ExamResultEnum.PASSED);
		}
		else
		{
			exam.setResult(ExamResultEnum.REJECTED);
		}
	}

}

