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
package my.hospitaldaoservice.cronjobs.physicalexamination;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaldaoservice.model.PhysicalExaminationModel;
import my.hospitaldaoservice.physicalexamination.service.PhysicalExaminationService;


/**
 *
 */
public class PhExaminationJob extends AbstractJobPerformable<CronJobModel>
{
	static final private Logger LOG = Logger.getLogger(PhExaminationJob.class);

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
	public PerformResult perform(final CronJobModel job)
	{
		LOG.info("### Entering ServiceLayerJob ###");
		final List<PhysicalExaminationModel> examsModel = phExaminationService.getAllPhysicalExamination();
		final List<PhysicalExaminationModel> newExamsModel = new ArrayList<PhysicalExaminationModel>();
		final Calendar now = Calendar.getInstance();
		for (final PhysicalExaminationModel em : examsModel)
		{
			if (now.getTime().getDay() < em.getDate().getDay() & now.getTime().getMonth() == em.getDate().getMonth()
					& now.getTime().getYear() == em.getDate().getYear())
			{
				newExamsModel.add(em);
			}
		}
		if (newExamsModel.isEmpty())
		{
			return new PerformResult(CronJobResult.UNKNOWN, CronJobStatus.FINISHED);
		}
		else
		{
			for (final PhysicalExaminationModel nem : newExamsModel)
			{

				LOG.info("### Code: " + nem.getCode() + " ###");
				LOG.info("### Date: " + nem.getDate().toString() + " ###");
				LOG.info("### Doctor: " + nem.getDoctor().getName() + " " + nem.getDoctor().getSurname() + "###");
				LOG.info("### Patient: " + nem.getPatient().getName() + " " + nem.getPatient().getSurname() + "###");

			}
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
	}

}
