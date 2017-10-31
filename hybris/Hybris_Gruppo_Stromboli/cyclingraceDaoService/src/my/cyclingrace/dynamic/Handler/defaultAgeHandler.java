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
package my.cyclingrace.dynamic.Handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import my.cyclingraceDaoService.model.CyclistModel;


/**
 *
 */
public class defaultAgeHandler implements DynamicAttributeHandler<String, CyclistModel>
{
	public static int age = 0;

	@Override
	public String get(final CyclistModel cyclistModel)
	{
		return age + "";
	}

	@Override
	public void set(final CyclistModel cyclistModel, final String date)
	{
		final DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		Date d = new Date();
		try
		{
			d = format.parse(date);
		}
		catch (final ParseException e)
		{
			e.printStackTrace();
		}
		final LocalDate birthdate = new LocalDate(d);
		final LocalDate now = new LocalDate();
		age = Years.yearsBetween(birthdate, now).getYears();

	}
}
