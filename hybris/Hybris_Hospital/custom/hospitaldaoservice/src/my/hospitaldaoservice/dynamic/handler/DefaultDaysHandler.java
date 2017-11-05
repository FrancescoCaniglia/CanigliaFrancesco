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
package my.hospitaldaoservice.dynamic.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import my.hospitaldaoservice.model.PatientModel;



/**
 *
 */
public class DefaultDaysHandler implements DynamicAttributeHandler<Integer, PatientModel>
{
	private static final Logger LOG = Logger.getLogger(DefaultDaysHandler.class);
	private int day;

	@Override
	public Integer get(final PatientModel patient)
	{
		LOG.info("###Dynamic Attribute Handler ###");
		if (patient.getEscDate() != null)
		{
			final Date enter = patient.getEnterDate();
			final Date esc = patient.getEscDate();
			final LocalDate enterDate = new LocalDate(enter);
			final LocalDate escDate = new LocalDate(esc);
			day = Days.daysBetween(enterDate, escDate).getDays();
			final Integer days = new Integer(day);
			return days;
		}
		else
		{
			final Date enter = patient.getEnterDate();
			final Date now = Calendar.getInstance().getTime();
			final LocalDate enterDate = new LocalDate(enter);
			final LocalDate nowDate = new LocalDate(now);
			day = Days.daysBetween(enterDate, nowDate).getDays();
			final Integer days = new Integer(day);
			return days;
		}
	}

	@Override
	public void set(final PatientModel patient, final Integer days)
	{
		// YTODO Auto-generated method stub
	}

}
