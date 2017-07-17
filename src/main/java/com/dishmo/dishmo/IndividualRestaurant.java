package com.dishmo.dishmo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class IndividualRestaurant {

	@Id
	@GeneratedValue
	private Long restaurantId;
	private String restaurantName;
	private String address;
	private String websiteUrl;
	private String phoneNumber;
	private String hours;
	private String facebookUrl;
	private String twitterUrl;
	private String instagramUrl;
	private String yelpUrl;
	private String price;
	
	@ManyToOne
	private Category category;
	
	private String rating;
	private String mainPagePictureUrl;
	
	private IndividualRestaurant() {
	}

	public IndividualRestaurant(String restaurantName, String address, String websiteUrl,
			String phoneNumber, String hours, String facebookUrl, String twitterUrl, String instagramUrl,
			String yelpUrl, String price, Category category, String rating, String mainPagePictureUrl) {
		this.restaurantName = restaurantName;
		this.address = address;
		this.websiteUrl = websiteUrl;
		this.phoneNumber = phoneNumber;
		this.hours = hours;
		this.facebookUrl = facebookUrl;
		this.twitterUrl = twitterUrl;
		this.instagramUrl = instagramUrl;
		this.yelpUrl = yelpUrl;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.mainPagePictureUrl = mainPagePictureUrl;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public String getAddress() {
		return address;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getHours() {
		return hours;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public String getTwitterUrl() {
		return twitterUrl;
	}

	public String getInstagramUrl() {
		return instagramUrl;
	}

	public String getYelpUrl() {
		return yelpUrl;
	}

	public String getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	public String getRating() {
		return rating;
	}

	public String getMainPagePictureUrl() {
		return mainPagePictureUrl;
	}
	
	
	
}
