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

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.util.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitaldaoservice.physicalexamination.service.PhysicalExaminationService;


public class PhysicalExaminationListner extends AbstractEventListener<PhysicalExaminationEvent>
{


	private static final Logger LOG = Logger.getLogger(PhysicalExaminationListner.class);
	PhysicalExaminationService phExaminationService;





	/**
	 * @return the phExaminationService
	 */
	public PhysicalExaminationService getPhExaminationService()
	{
		return phExaminationService;
	}





	@Required
	public void setPhExaminationService(final PhysicalExaminationService phExaminationService)
	{
		this.phExaminationService = phExaminationService;
	}





	@Override
	protected void onEvent(final PhysicalExaminationEvent event)
	{
		final String path = Config.getParameter("path").toString();
		final List<PhysicalExaminationModel> exams = phExaminationService.getPhysicalExamforPk(event.getPk());
		PrintWriter pw;
		LOG.info("### Write file ###");
		try
		{
			LOG.info("### Write file ###");
			pw = new PrintWriter(new File(path));
			final StringBuilder sb = new StringBuilder();
			sb.append("Medical Records : " + exams.get(0).getPatient().getName() + " " + exams.get(0).getPatient().getSurname());
			sb.append(',');
			for (final PhysicalExaminationModel pem : exams)
			{
				sb.append(pem.getCode());
				sb.append(',');
				sb.append(pem.getDoctor().getName());
				sb.append(',');
				sb.append(pem.getDoctor().getWard().getName());
				sb.append(',');
				sb.append(pem.getResult());
				sb.append(',');
				sb.append(pem.getDate());
				sb.append('\n');
			}
			pw.write(sb.toString());
			pw.close();
		}
		catch (final FileNotFoundException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}
