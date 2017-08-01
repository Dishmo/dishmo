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
	private String imageUrl2;
	private String imageUrl3;

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

	public String getImageUrl2() {
		return imageUrl2;
	}

	public String getImageUrl3() {
		return imageUrl3;
	}

	private AlcoholicBeverage() {

	}

	public SampleMenu getSampleMenu() {
		return sampleMenu;
	}

	public AlcoholicBeverage(String name, String whereFrom, String price, SampleMenu sampleMenu, String imageUrl,
			String imageUrl2, String imageUrl3) {
		this.name = name;
		this.whereFrom = whereFrom;
		this.price = price;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
		this.imageUrl3 = imageUrl3;
	}

}
