package com.dishmo.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dessert {

	@Id
	@GeneratedValue
	private Long dessertId;
	
	private String name;
	private String price;
	private String imageUrl;

	@ManyToOne
	private SampleMenu sampleMenu;

	public Long getDessertId() {
		return dessertId;
	}

	public String getName() {
		return name;
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

	private Dessert() {

	}

	public Dessert(String name, String price, SampleMenu sampleMenu, String imageUrl) {
		this.name = name;
		this.price = price;
		this.sampleMenu = sampleMenu;
		this.imageUrl = imageUrl;
	}

}
