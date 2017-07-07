package com.paigeruppel.startrekreviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CharacterController {

	@Resource
	private SeasonRepository seasonRepo;
	
	@Resource
	private EpisodeRepository episodeRepo;

	@Resource
	private CharacterRepository characterRepo;
	
	
	@RequestMapping("/characters")
	public String showCharacters(Model model) {
		model.addAttribute("seasons", seasonRepo.findAll());
		model.addAttribute("characters", characterRepo.findAll());
		return "characters";
	}
	
	@RequestMapping("/characters/delete/{id}")
	public String deleteCharacter(@PathVariable long id) {
		Character toDelete = characterRepo.findOne(id);
		for(Episode episode: toDelete.getEpisodes()) {
			episode.removeCharacter(toDelete);
			episodeRepo.save(episode);
		}
		characterRepo.delete(toDelete);
		return "redirect:/characters";
	}
}
