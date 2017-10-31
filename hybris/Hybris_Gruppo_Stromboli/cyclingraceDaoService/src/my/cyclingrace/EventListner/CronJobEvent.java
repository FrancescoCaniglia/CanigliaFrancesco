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
package my.cyclingrace.EventListner;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingrace.Stage.Service.Impl.MyNewStageJob;


/**
 *
 */
public class CronJobEvent extends AbstractEvent
{

	MyNewStageJob myjob;

	/**
	 * @return the myjob
	 */
	public MyNewStageJob getMyjob()
	{
		return myjob;
	}

	@Required
	public void setMyjob(final MyNewStageJob myjob)
	{
		this.myjob = myjob;
	}



}
