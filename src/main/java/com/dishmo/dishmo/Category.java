package com.dishmo.dishmo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long categoryId;
	
	private String name;
	
	@OneToMany(mappedBy = "category")
	private Set<IndividualRestaurant> restaurant;

	public Long getCategoryId() {
		return categoryId;
	}

	public String getName() {
		return name;
	}

	public Set<IndividualRestaurant> getRestaurant() {
		return restaurant;
	}
	
	private Category() {
	}

	public Category(String name) {
		this.name = name;
	}
	
	
}
