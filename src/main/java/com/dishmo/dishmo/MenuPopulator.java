package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuPopulator implements CommandLineRunner {

	@Resource
	private BreakfastRepository breakfastRepo;

	@Resource
	private SampleMenuRepository sampleMenuRepo;

	@Override
	public void run(String... args) throws Exception {

		// Breakfast
		SampleMenu breakfast = new SampleMenu();
		sampleMenuRepo.save(breakfast);

		Breakfast housemadeGranola = new Breakfast("Housemade Granola",
				"Organic rolled oats, almonds, pecans, fat-free Greek yogurt, fresh fruit, honey and pistachio praline brittle",
				"$9", breakfast, "/images/Breakfast/housemade-granola.jpeg");
		Breakfast prosciuttoAndPoachedEggs = new Breakfast("Prosciutto and Poached Eggs",
				"Three organic valley eggs* and La Quercia prosciutto on toasted rosemary focaccia with parmesan",
				"$13", breakfast, "/images/Breakfast/prosciutto-and-poached-eggs.jpeg");
		Breakfast cloudNinePancakes = new Breakfast("Cloud Nine Pancakes",
				"Three ricotta pancakes served with real maple syrup and bananas", "3", breakfast,
				"/images/Breakfast/cloud-nine-pancakes.jpeg");
		Breakfast sweetPotatoAndTurkeyHash = new Breakfast("Sweet Potato and Turkey Hash",
				"Applewood smoked turkey, red peppers, sweet onions, and two sunny eggs*", "$13", breakfast,
				"/images/Breakfast/sweet-potato-and-turkey-hash.png");
		Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried hashbrown patties", "3", breakfast, "");
		Breakfast bigBurrito = new Breakfast("Big Burrito",
				"Eggs, organic black beans, roasted sweet potatoes, sautéed peppers & onions, melted white cheddar and Northstar’s salsa",
				"$11", breakfast, "/images/Breakfast/big-burrito.jpg");
		Breakfast cowboyBreakfast = new Breakfast("Cowboy Breakfast",
				"Two organic eggs prepared any style*, bacon or sausage and a warm buttermilk buscuit with Michigan black cherry preserves",
				"$13", breakfast, "/images/Breakfast/cowboy-breakfast.jpg");
		Breakfast theStandardEggSandwich = new Breakfast("The Standard Egg Sandwich",
				"Warm from the oven buttermilk buscuit topped with two over-medium eggs* and aged white cheddar",
				"$9.5", breakfast, "imageUrl");

		breakfastRepo.save(housemadeGranola);
		breakfastRepo.save(prosciuttoAndPoachedEggs);
		breakfastRepo.save(cloudNinePancakes);
		breakfastRepo.save(sweetPotatoAndTurkeyHash);
		breakfastRepo.save(bigBurrito);
		breakfastRepo.save(cowboyBreakfast);
		breakfastRepo.save(theStandardEggSandwich);

		// Lunch
		// SampleMenu lunch = new SampleMenu();
		// sampleMenuRepo.save(lunch);
		//
		// Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your
		// preference", "5", breakfast, "");
		// Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy
		// bacon", "3", breakfast, "");
		// Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes",
		// "5", breakfast, "");
		// Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried
		// hashbrown patties", "3", breakfast, "");
		//
		// breakfastRepo.save(eggs);
		// breakfastRepo.save(bacon);
		// breakfastRepo.save(pancakes);
		// breakfastRepo.save(hashbrowns);

		// Dinner
		// SampleMenu breakfast = new SampleMenu();
		// sampleMenuRepo.save(breakfast);
		//
		// Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your
		// preference", "5", breakfast, "");
		// Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy
		// bacon", "3", breakfast, "");
		// Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes",
		// "5", breakfast, "");
		// Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried
		// hashbrown patties", "3", breakfast, "");
		//
		// breakfastRepo.save(eggs);
		// breakfastRepo.save(bacon);
		// breakfastRepo.save(pancakes);
		// breakfastRepo.save(hashbrowns);

		// Appetizer
		// SampleMenu breakfast = new SampleMenu();
		// sampleMenuRepo.save(breakfast);
		//
		// Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your
		// preference", "5", breakfast, "");
		// Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy
		// bacon", "3", breakfast, "");
		// Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes",
		// "5", breakfast, "");
		// Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried
		// hashbrown patties", "3", breakfast, "");
		//
		// breakfastRepo.save(eggs);
		// breakfastRepo.save(bacon);
		// breakfastRepo.save(pancakes);
		// breakfastRepo.save(hashbrowns);

		// Dessert
		// SampleMenu breakfast = new SampleMenu();
		// sampleMenuRepo.save(breakfast);
		//
		// Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your
		// preference", "5", breakfast, "");
		// Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy
		// bacon", "3", breakfast, "");
		// Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes",
		// "5", breakfast, "");
		// Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried
		// hashbrown patties", "3", breakfast, "");
		//
		// breakfastRepo.save(eggs);
		// breakfastRepo.save(bacon);
		// breakfastRepo.save(pancakes);
		// breakfastRepo.save(hashbrowns);
		//

	}

}
