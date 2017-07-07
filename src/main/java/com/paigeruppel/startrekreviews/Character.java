package com.paigeruppel.startrekreviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Character {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@ManyToMany(mappedBy="characters")
	private Set<Episode> episodes;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Episode> getEpisodes() {
		return episodes;
	}
	
	//for JPA
	private Character() {}
	
	public Character(String name) {
		this.name = name;
	}
	
	

}
