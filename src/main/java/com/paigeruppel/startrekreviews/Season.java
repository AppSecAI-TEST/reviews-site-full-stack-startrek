package com.paigeruppel.startrekreviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Season {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "season")
	private Set<Episode> episodes;
	
	private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Set<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(Set<Episode> episodes) {
		this.episodes = episodes;
	}

	private Season() {}

	public Season(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
	return name;
	}
	
}
