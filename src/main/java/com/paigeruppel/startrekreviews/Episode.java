package com.paigeruppel.startrekreviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Episode {

	@GeneratedValue
	@Id
	private Long id;

	@ManyToMany
	private Set<Character> characters;
	
	@OneToMany(mappedBy = "episode")
	private Set<Comment> comments;
	
	@ManyToOne
	private Season season;

	private int episodeNumber;

	private String imageUrl;

	private String name;
	
	private int rating;
	
	@Lob
	private String description;
	
	@Lob
	private String review;
	

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public Long getId() {
		return id;
	}

	public Season getSeason() {
		return season;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReview() {
		return review;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String fetchRatingImage(int rating) {
		String ratingImage = null;
		switch (rating) {
		case 1: 
			ratingImage ="/images/rating_1.jpg";
			break;
		case 2: 
			ratingImage ="/images/rating_2.jpg";
			break;
		case 3: 
			ratingImage ="/images/rating_3.jpg";
			break;
		case 4: 
			ratingImage ="/images/rating_4.jpg";
			break;
		}
		return ratingImage;
		
	}

	public Set<Character> getCharacters() {
		return characters;
	}

	private Episode() {
	}

	public Episode(Season season, int episodeNumber, String name, String description, String review, Character...characterTags) {
		this.season = season;
		this.episodeNumber = episodeNumber;
		this.name = name;
		this.description = description;
		this.review = review;
		this.characters = new HashSet<>(Arrays.asList(characterTags));
	}

	public Episode(Season season, int episodeNumber, String name) {
		this.season = season;
		this.episodeNumber = episodeNumber;
		this.name = name;
		this.description = "This episode has not yet been reviewed";
		this.review = "Looks like this episode still needs a review! If you have comments, please add them below";
		
	}
	
	public void removeCharacter(Character character) {
		characters.remove(character);
	}

}
