package com.dishmo.dishmo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MenuItem {

	@Id
	@GeneratedValue
	private Long id;

	private String menuItemName;

	@Lob
	private String menuItemDescription;

	private String menuItemRating;
	private String menuItemPrice;

	@OneToMany(mappedBy = "menuItem")
	private Set<Review> review;

	@ManyToOne
	private Restaurant restaurant;
	
	public Restaurant getRestaurant(){
		return restaurant;
	}

	public Long getId() {
		return id;
	}

	public Set<Review> getReview() {
		return review;
	}

	public String getMenuItemName() {
		return menuItemName;
	}

	public String getMenuItemDescription() {
		return menuItemDescription;
	}

	public String getMenuItemRating() {
		return menuItemRating;
	}

	public String getMenuItemPrice() {
		return menuItemPrice;
	}

	public MenuItem(String menuItemName, Restaurant restaurant, String menuItemDescription, String menuItemRating,
			String menuItemPrice) {
		this.menuItemName = menuItemName;
		this.restaurant = restaurant;
		this.menuItemDescription = menuItemDescription;
		this.menuItemRating = menuItemRating;
		this.menuItemPrice = menuItemPrice;
	}

	private MenuItem() {

	}
}
