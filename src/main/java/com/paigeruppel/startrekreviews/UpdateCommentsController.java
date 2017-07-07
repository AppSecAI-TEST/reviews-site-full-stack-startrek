package com.paigeruppel.startrekreviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateCommentsController {

	@Resource
	private CommentRepository commentRepo;
	
	@Resource
	private EpisodeRepository episodeRepo;
	
	@RequestMapping("/createComment")
	public String createComment(@RequestParam long episodeId, @RequestParam String title, @RequestParam String content) {
		Episode selected = episodeRepo.findOne(episodeId);
		commentRepo.save(new Comment(selected, title, content));
		return "redirect:/tngseason/episode?id=" + episodeId;
	}
}
