package com.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lunch {

	@Id
	@GeneratedValue
	private Long lunchId;

	private String name;
	private String description;
	private String price;
	private String imageUrl;
	private String imageUrl2;
	private String imageUrl3;

	@ManyToOne
	private SampleMenu sampleMenu;

	public Long getLunchId() {
		return lunchId;
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
	public String getImageUrl2() {
		return imageUrl2;
	}

	public String getImageUrl3() {
		return imageUrl3;
	}

	private Lunch() {

	}

	public Lunch(String name, String description, String price, SampleMenu sampleMenu, String imageUrl, String imageUrl2, String imageUrl3) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.sampleMenu = sampleMenu;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
		this.imageUrl3 = imageUrl3;
	}
}
