package com.dishmo.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appetizer {
	
	@Id
	@GeneratedValue
	private Long appetizerId;

	private String name;
	private String description;
	private String price;
	private String imageUrl;
	
	@ManyToOne
	private SampleMenu sampleMenu;

	public Long getAppetizerId() {
		return appetizerId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return price;
	}

	public SampleMenu getSampleMenu() {
		return sampleMenu;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	private Appetizer() {
	
	}

	public Appetizer(String name, String description, String price, SampleMenu sampleMenu, String imageUrl) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.sampleMenu = sampleMenu;
		this.imageUrl = imageUrl;
	}
	
	
	
	
	
}
