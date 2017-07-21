package com.dishmo.dishmo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue
	private Long restaurantId;
	private String name;
	private String address;
	private String websiteUrl;
	private String phoneNumber;
	private String hours;
	private String facebookUrl;
	private String twitterUrl;
	private String instagramUrl;
	private String yelpUrl;
	private String price;
	
	@OneToMany(mappedBy = "restaurant")
	private Set<MenuItem> menuItem;
	
	@ManyToOne
	private Category category;
	
	private String rating;
	private String mainPagePictureUrl;
	
	private Restaurant() {
	}

	public Restaurant(String name, String address, String websiteUrl,
			String phoneNumber, String hours, String facebookUrl, String twitterUrl, String instagramUrl,
			String yelpUrl, String price, Category category, String mainPagePictureUrl) {
		this.name = name;
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
		this.mainPagePictureUrl = mainPagePictureUrl;
	}
	public Set<MenuItem> getMenuItem() {
		return menuItem;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public String getName() {
		return name;
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
