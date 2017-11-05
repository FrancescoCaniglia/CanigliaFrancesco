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
package my.hospitaldaoservice.interceptor.physicalExamination;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.apache.log4j.Logger;

import my.hospitaldaoservice.enums.ExaminationResult;
import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitaldaoservice.physicalexamination.event.PhysicalExaminationEvent;


/**
 *
 */
public class PhExamValidateInterceptor implements ValidateInterceptor<PhysicalExaminationModel>
{
	private static final Logger LOG = Logger.getLogger(PhExamValidateInterceptor.class);


	private EventService eventService;


	@Override
	public void onValidate(final PhysicalExaminationModel pem, final InterceptorContext ctx) throws InterceptorException
	{
		LOG.info("###Validate My Physical Examination ###");
		if (pem.getResult() == ExaminationResult.POSITIVE)
		{
			LOG.info("###Validate My Physical Examination 00000###");
			LOG.info("###Validate My Physical Examination 111111###");
			LOG.info("###Validate My Physical Examination 22222###");
			eventService.publishEvent(new PhysicalExaminationEvent(pem.getPk()));
		}

	}

}
