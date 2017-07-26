package com.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Drink {

	@Id
	@GeneratedValue
	private long drinkId;

	private String name;
	private String whereFrom;
	private String price;
	private String imageUrl;

	@ManyToOne
	private SampleMenu sampleMenu;

	public long getDrinkId() {
		return drinkId;
	}

	public String getName() {
		return name;
	}
	
	public String getWhereFrom() {
		return whereFrom;
	}

	public String getPrice() {
		return price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	private Drink() {

	}

	public SampleMenu getSampleMenu() {
		return sampleMenu;
	}

	public Drink(String name, String price, SampleMenu sampleMenu, String imageUrl) {
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
	}

}

