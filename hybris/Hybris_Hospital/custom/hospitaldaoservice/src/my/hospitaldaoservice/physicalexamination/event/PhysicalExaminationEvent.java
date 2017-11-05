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
package my.hospitaldaoservice.physicalexamination.event;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import org.apache.log4j.Logger;



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

/**
 *
 */
public class PhysicalExaminationEvent extends AbstractEvent
{
	private static final Logger LOG = Logger.getLogger(PhysicalExaminationEvent.class);

	private final PK pk;

	/**
	 * @return the pk
	 */
	public PK getPk()
	{
		return pk;
	}


	public PhysicalExaminationEvent(final PK pk)
	{
		super();
		this.pk = pk;
	}


	@Override
	public String toString()
	{
		return "PhysicalExaminationEvent [pk=" + pk + "]";
	}



}
