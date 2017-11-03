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
package cyclingrace.cyclistteam.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cyclingrace.cyclist.Facade.CyclistFacade;
import cyclingrace.cyclistteam.Facade.CyclistTeamFacade;
import cyclingrace.manager.Facade.ManagerFacade;
import my.cyclingraceDaoService.data.CyclistData;
import my.cyclingraceDaoService.data.CyclistTeamData;
import my.cyclingraceDaoService.data.ManagerData;


public class CyclistTeamController
{
	private CyclistTeamFacade cyclistTeamFacade;
	private CyclistFacade cyclistFacade;
	private ManagerFacade managerFacade;


	@RequestMapping(value = "/team")
	public String showTeam(final Model model)
	{
		final List<CyclistTeamData> team = cyclistTeamFacade.getAllCyclistTeam();
		model.addAttribute("team", team);
		int i = 0;
		for (final CyclistTeamData ctd : team)
		{
			final String codeTeam = ctd.getCode();
			final List<CyclistData> cyclists = cyclistFacade.getCyclistForTeam(codeTeam);
			model.addAttribute("cyclists" + i, cyclists);
			final ManagerData manager = managerFacade.getManagerForCode(codeTeam);
			model.addAttribute("manager" + i, manager);
			i++;
		}

		return "TeamList";
	}


	@Autowired
	public void setFacade(final CyclistTeamFacade facade)
	{
		this.cyclistTeamFacade = facade;
	}


}
