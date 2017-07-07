package com.paigeruppel.startrekreviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@GeneratedValue
	@Id
	private Long id;
	
	@ManyToOne
	private Episode episode;

	private String title;

	@Lob
	private String content;

	public Long getId() {
		return id;
	}

	public Episode getEpisode() {
		return episode;
	}
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Comment(Episode episode, String title, String content) {
		this.episode = episode;
		this.title = title;
		this.content=content;
	}
	
	private Comment() {}

}
