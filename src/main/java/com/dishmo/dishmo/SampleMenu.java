package com.dishmo.dishmo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SampleMenu {

	@Id
	@GeneratedValue
	private Long sampleMenuId;

	@OneToMany(mappedBy = "sampleMenu")
	private Set<Appetizer> appetizer;

	@OneToMany(mappedBy = "sampleMenu")
	private Set<Lunch> lunch;

	@OneToMany(mappedBy = "sampleMenu")
	private Set<Dinner> dinner;

	@OneToMany(mappedBy = "sampleMenu")
	private Set<Breakfast> breakfast;

	@OneToMany(mappedBy = "sampleMenu")
	private Set<Dessert> dessert;

	@OneToMany(mappedBy = "sampleMenu")
	private Set<AlcoholicBeverage> alcoholicBeverage;

	public Long getSampleMenuId() {
		return sampleMenuId;
	}

	public Set<Appetizer> getAppetizer() {
		return appetizer;
	}

	public Set<Lunch> getLunch() {
		return lunch;
	}

	public Set<Dinner> getDinner() {
		return dinner;
	}

	public Set<Breakfast> getBreakfast() {
		return breakfast;
	}

	public Set<Dessert> getDessert() {
		return dessert;
	}

	public Set<AlcoholicBeverage> getAlcoholicBeverage() {
		return alcoholicBeverage;
	}

	public SampleMenu() {

	}

}
