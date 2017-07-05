package com.paigeruppel.startrekreviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;

@Entity
public class Episode {

	@GeneratedValue
	@Id
	private Long id;

	@ManyToOne
	private Season season;

	private String episodeNumber;

	private String imageUrl;

	private String name;
	
	private int rating;
	
	@Lob
	private String description;
	
	@Lob
	private String review;
	

	public String getEpisodeNumber() {
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

	private Episode() {
	}

	public Episode(Season season, String episodeNumber, String name, String description, String review) {
		this.season = season;
		this.episodeNumber = episodeNumber;
		this.name = name;
		this.description = description;
		this.review = review;
	}

	public Episode(Season season, String episodeNumber, String name) {
		this.season = season;
		this.episodeNumber = episodeNumber;
		this.name = name;
	}

}
