package com.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AlcoholicBeverage {

	@Id
	@GeneratedValue
	private long alcoholicDrinkId;

	private String name;
	private String whereFrom;
	private String price;
	private String imageUrl;

	@ManyToOne
	private SampleMenu sampleMenu;

	public long getAlcoholicDrinkId() {
		return alcoholicDrinkId;
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

	private AlcoholicBeverage() {

	}

	public SampleMenu getSampleMenu() {
		return sampleMenu;
	}

	public AlcoholicBeverage(String name, String whereFrom, String price, SampleMenu sampleMenu, String imageUrl) {
		this.name = name;
		this.whereFrom = whereFrom;
		this.price = price;
		this.imageUrl = imageUrl;
	}

}
