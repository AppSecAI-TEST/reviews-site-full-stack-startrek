package com.paigeruppel.startrekreviews;

import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.OrderBy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SeasonController {

	@Resource
	private SeasonRepository tngSeasonRepo;
	

	@RequestMapping("/home")
	public String fetchSeasons(Model model) {
		model.addAttribute("seasons", tngSeasonRepo.findAll());
		return "seasons";
	}

	@RequestMapping("/tngseason")
	public String fetchSeason(@RequestParam("id") long id, Model model) {
		model.addAttribute("seasons", tngSeasonRepo.findAll());
		model.addAttribute(tngSeasonRepo.findOne(id));
		return "season";
	}
	
}
