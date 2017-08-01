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
	private String imageUrl2;
	private String imageUrl3;

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
	public String getImageUrl2() {
		return imageUrl2;
	}

	public String getImageUrl3() {
		return imageUrl3;
	}

	private Drink() {

	}

	public SampleMenu getSampleMenu() {
		return sampleMenu;
	}

	public Drink(String name, String price, SampleMenu sampleMenu, String imageUrl, String imageUrl2, String imageUrl3) {
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
		this.imageUrl3 = imageUrl3;
	}

}

