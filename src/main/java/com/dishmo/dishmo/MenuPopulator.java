package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuPopulator implements CommandLineRunner {

	@Resource
	private BreakfastRepository breakfastRepo;

	@Resource
	private LunchRepository lunchRepo;
	
	@Resource
	private DinnerRepository dinnerRepo;
	
	@Resource
	private SampleMenuRepository sampleMenuRepo;

	@Override
	public void run(String... args) throws Exception {

		// Breakfast
		SampleMenu breakfast = new SampleMenu();
		sampleMenuRepo.save(breakfast);

//		Breakfast something = new Breakfast("name", "description", "price", breakfast, "/images/Breakfast/");
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
				"$9.5", breakfast, "/images/Breakfast/the-standard-egg-sandwich.jpeg");

		breakfastRepo.save(housemadeGranola);
		breakfastRepo.save(prosciuttoAndPoachedEggs);
		breakfastRepo.save(cloudNinePancakes);
		breakfastRepo.save(sweetPotatoAndTurkeyHash);
		breakfastRepo.save(hashbrowns);
		breakfastRepo.save(bigBurrito);
		breakfastRepo.save(cowboyBreakfast);
		breakfastRepo.save(theStandardEggSandwich);

		// Lunch
		 SampleMenu lunch = new SampleMenu();
		 sampleMenuRepo.save(lunch);
		
//		 Lunch something = new Lunch("name", "description", "price", lunch, "/images/Lunch/");
		 Lunch simpleSalad = new Lunch("Simple Salad", "Crisp greens and rosemary croutons with café vinaigrette", "5", lunch, "/images/Lunch/simple-salad.jpeg");
		 Lunch choppedSalad = new Lunch("Chopped Salad", "Applewood smoked turkey, bacon, avocado, blue cheese, almonds, croutons and apples with face vinaigrette", "15", lunch, "/images/Lunch/chopped-salad.jpeg");
		 Lunch beechwaldSalad = new Lunch("Beechwald Salad", "Roasted chicken, dates, avocado, tomatoes, corn, goat cheese, croutons and almonds with champagne vinaigrette", "14", lunch, "/images/Lunch/beechwald-salad.jpeg");
		 Lunch citrusCrunchSalad = new Lunch("Citrus Crunch Salad", "Shredded chicken, crisp vegetables, mango and fresh herbs with tortillas and peanut lime dressing", "14.5", lunch, "/images/Lunch/citrus-crunch-salad.jpg");
		 Lunch buddhaBowl = new Lunch("Buddha Bowl", "Pan seared organic tofu or roasted chicken, long-grain brown rice with peanut sauce and bright veggies", "13", lunch, "/images/Lunch/buddha-bowl.jpeg");
		 Lunch squareMeal = new Lunch("Square Meal", "Spicy organic black beans over brown rice with sautéed peppers & onions, avocado, cheddar and corn tortillas", "10", lunch, "/images/Lunch/square-meal.jpg");
		 Lunch northstarBurger = new Lunch("Northstar Burger", "Just made with organic black beans, brown rice and beets, topped with white cheddar, kale, tomato, pickle and onion + simple salad", "14", lunch, "/images/Lunch/northstar-burger.jpeg");
		 Lunch classicCheeseburger = new Lunch("Classic Cheeseburger", "Nilman Ranch brisket and chuck*, ground in-house daily, topped with cheddar, lettuce, tomato, onion, pickle + breakfast potatoes", "15", lunch, "/images/Lunch/classic-cheeseburger.jpeg");
		 Lunch fishSandwich = new Lunch("Fish Sandwich", "Grilled barramundi filet with lettuce, tomato, red onion, and herb aioli + simple salad", "17", lunch, "/images/Lunch/fish-sandwich.jpg");
		 Lunch chickenAndAvoSandwich = new Lunch("Chicken & Avocado Sandwich", "Roasted Bell & Evans chicken, avocado, smoked gouda, roasted red peppers and greens with cayenne aioli + sweet potato fries", "15", lunch, "/images/Lunch/chicken-and-avocado-sandwich.jpg");
		 Lunch thaiburrito = new Lunch("Thai Burrito", "Seared organic tofu or roasted chicken with peanut sauce, crunchy slaw and brown rice + tortilla chips & Thai dipping sauce", "12.5", lunch, "/images/Lunch/thai-burrito.jpg");
		 Lunch sweetBasilBurrito = new Lunch("Sweet Basil Burrito", "Rotisserie roasted chicken or seared tofu with creamy pesto, sautéed veggies and brown rice + tortilla chips & Northstar’s salsa", "13", lunch, "/images/Lunch/sweet-basil-burrito.jpg");
		 Lunch spicyHarvest = new Lunch("Spicy Harvest", "Smoked gouda, pepperoni, corn, jalapeños with organic tomato sauce on a whole wheat crust", "14", lunch, "/images/Lunch/spicy-harvest-pizza.jpg");
		 Lunch housemadeSausage = new Lunch("Housemade Sausage", "Crumbled sausace and Mamma Lil’s Peppers paired with organic tomato sauce, provolone and parmesan", "14", lunch, "/images/Lunch/housemade-sausage-pizza.jpg");
		 Lunch smokedGoudaAndChicken = new Lunch("Smoked Gouda + Chicken", "Rotisserie roasted chicken, Northstar’s BBQ sauce, red peppers, onions, cilantro and peanuts", "14", lunch, "/images/Lunch/smoked-gouda-and-chicken-pizza.jpg");
		 Lunch highStreetVegetable = new Lunch("High Street Vegetable", "Crunchy veggies, tomatoes, mushrooms, jalapeños, sunflower seeds, aged provolone and Grana Padano", "12", lunch, "/images/Lunch/high-street-vegetable-pizza.jpeg");
		 
		 lunchRepo.save(simpleSalad);
		 lunchRepo.save(choppedSalad);
		 lunchRepo.save(beechwaldSalad);
		 lunchRepo.save(citrusCrunchSalad);
		 lunchRepo.save(buddhaBowl);
		 lunchRepo.save(squareMeal);
		 lunchRepo.save(northstarBurger);
		 lunchRepo.save(classicCheeseburger);
		 lunchRepo.save(fishSandwich);
		 lunchRepo.save(chickenAndAvoSandwich);
		 lunchRepo.save(thaiburrito);
		 lunchRepo.save(sweetBasilBurrito);
		 lunchRepo.save(spicyHarvest);
		 lunchRepo.save(housemadeSausage);
		 lunchRepo.save(smokedGoudaAndChicken);
		 lunchRepo.save(highStreetVegetable);
		 
		// Dinner
		 SampleMenu dinner = new SampleMenu();
		 sampleMenuRepo.save(dinner);
		
//		 Dinner something = new Dinner("name", "description", "price", dinner, "/images/Dinner/");
		 Dinner simpleSaladD = new Dinner("Simple Salad", "Crisp greens and rosemary croutons with café vinaigrette", "5", dinner, "/images/Dinner/simple-salad.jpeg");
		 Dinner choppedSaladD = new Dinner("Chopped Salad", "Applewood smoked turkey, bacon, avocado, blue cheese, almonds, croutons and apples with face vinaigrette", "15", dinner, "/images/Dinner/chopped-salad.jpeg");
		 Dinner beechwaldSaladD = new Dinner("Beechwald Salad", "Roasted chicken, dates, avocado, tomatoes, corn, goat cheese, croutons and almonds with champagne vinaigrette", "14", dinner, "/images/Dinner/beechwald-salad.jpeg");
		 Dinner citrusCrunchSaladD = new Dinner("Citrus Crunch Salad", "Shredded chicken, crisp vegetables, mango and fresh herbs with tortillas and peanut lime dressing", "14.5", dinner, "/images/Dinner/citrus-crunch-salad.jpg");
		 Dinner buddhaBowlD = new Dinner("Buddha Bowl", "Pan seared organic tofu or roasted chicken, long-grain brown rice with peanut sauce and bright veggies", "13", dinner, "/images/Dinner/buddha-bowl.jpeg");
		 Dinner squareMealD = new Dinner("Square Meal", "Spicy organic black beans over brown rice with sautéed peppers & onions, avocado, cheddar and corn tortillas", "10", dinner, "/images/Dinner/square-meal.jpg");
		 Dinner northstarBurgerD = new Dinner("Northstar Burger", "Just made with organic black beans, brown rice and beets, topped with white cheddar, kale, tomato, pickle and onion + simple salad", "14", dinner, "/images/Dinner/northstar-burger.jpeg");
		 Dinner classicCheeseburgerD = new Dinner("Classic Cheeseburger", "Nilman Ranch brisket and chuck*, ground in-house daily, topped with cheddar, lettuce, tomato, onion, pickle + breakfast potatoes", "15", dinner, "/Dinner/Lunch/classic-cheeseburger.jpeg");
		 Dinner fishSandwichD = new Dinner("Fish Sandwich", "Grilled barramundi filet with lettuce, tomato, red onion, and herb aioli + simple salad", "17", dinner, "/images/Dinner/fish-sandwich.jpg");
		 Dinner chickenAndAvoSandwichD = new Dinner("Chicken & Avocado Sandwich", "Roasted Bell & Evans chicken, avocado, smoked gouda, roasted red peppers and greens with cayenne aioli + sweet potato fries", "15", dinner, "/images/Dinner/chicken-and-avocado-sandwich.jpg");
		 Dinner thaiburritoD = new Dinner("Thai Burrito", "Seared organic tofu or roasted chicken with peanut sauce, crunchy slaw and brown rice + tortilla chips & Thai dipping sauce", "12.5", dinner, "/images/Dinner/thai-burrito.jpg");
		 Dinner sweetBasilBurritoD = new Dinner("Sweet Basil Burrito", "Rotisserie roasted chicken or seared tofu with creamy pesto, sautéed veggies and brown rice + tortilla chips & Northstar’s salsa", "13", dinner, "/images/Dinner/sweet-basil-burrito.jpg");
		 Dinner spicyHarvestD = new Dinner("Spicy Harvest", "Smoked gouda, pepperoni, corn, jalapeños with organic tomato sauce on a whole wheat crust", "14", dinner, "/images/Dinner/spicy-harvest-pizza.jpg");
		 Dinner housemadeSausageD = new Dinner("Housemade Sausage", "Crumbled sausace and Mamma Lil’s Peppers paired with organic tomato sauce, provolone and parmesan", "14", dinner, "/images/Dinner/housemade-sausage-pizza.jpg");
		 Dinner smokedGoudaAndChickenD = new Dinner("Smoked Gouda + Chicken", "Rotisserie roasted chicken, Northstar’s BBQ sauce, red peppers, onions, cilantro and peanuts", "14", dinner, "/images/Dinner/smoked-gouda-and-chicken-pizza.jpeg");
		 Dinner highStreetVegetableD = new Dinner("High Street Vegetable", "Crunchy veggies, tomatoes, mushrooms, jalapeños, sunflower seeds, aged provolone and Grana Padano", "12", dinner, "/images/Dinner/high-street-vegetable-pizza.jpeg");
		 
		 dinnerRepo.save(simpleSaladD);
		 dinnerRepo.save(choppedSaladD);
		 dinnerRepo.save(beechwaldSaladD);
		 dinnerRepo.save(citrusCrunchSaladD);
		 dinnerRepo.save(buddhaBowlD);
		 dinnerRepo.save(squareMealD);
		 dinnerRepo.save(northstarBurgerD);
		 dinnerRepo.save(classicCheeseburgerD);
		 dinnerRepo.save(fishSandwichD);
		 dinnerRepo.save(chickenAndAvoSandwichD);
		 dinnerRepo.save(thaiburritoD);
		 dinnerRepo.save(sweetBasilBurritoD);
		 dinnerRepo.save(spicyHarvestD);
		 dinnerRepo.save(housemadeSausageD);
		 dinnerRepo.save(smokedGoudaAndChickenD);
		 dinnerRepo.save(highStreetVegetableD);
		 
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
