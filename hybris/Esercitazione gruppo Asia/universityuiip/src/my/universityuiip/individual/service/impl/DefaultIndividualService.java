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
package my.universityuiip.individual.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.individual.dao.IndividualDao;
import my.universityuiip.individual.service.IndividualService;
import my.universityuiip.model.ProfessorModel;
import my.universityuiip.model.StudentModel;



public class DefaultIndividualService implements IndividualService
{
	public IndividualDao individualDao;

	/**
	 * @return the individualDao
	 */
	public IndividualDao getIndividualDao()
	{
		return individualDao;
	}

	/**
	 * @param individualDao
	 *           the individualDao to set
	 */
	@Required
	public void setIndividualDao(final IndividualDao individualDao)
	{
		this.individualDao = individualDao;
	}

	@Override
	public StudentModel getStudentForCode(final String serialNumber)
	{
		final List<StudentModel> myList = individualDao.findStudentByCode(serialNumber);
		if (myList.isEmpty())
		{
			return null;
		}
		else if (myList.size() > 1)
		{
			System.out.println("errore: ci sono più risultati");
			return null;
		}
		else
		{
			return myList.get(0);
		}
	}

	@Override
	public ProfessorModel getProfessorForCode(final String serialNumber)
	{
		final List<ProfessorModel> myList = individualDao.fingProfessorByCode(serialNumber);
		if (myList.isEmpty())
		{
			return null;
		}
		else if (myList.size() > 1)
		{
			System.out.println("errore: ci sono più risultati");
			return null;
		}
		else
		{
			return myList.get(0);
		}
	}

}

