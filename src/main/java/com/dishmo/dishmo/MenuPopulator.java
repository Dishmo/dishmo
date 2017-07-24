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

		Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your preference", "5", breakfast, "");
		Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy bacon", "3", breakfast, "");
		Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes", "5", breakfast, "");
		Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried hashbrown patties", "3", breakfast, "");

		breakfastRepo.save(eggs);
		breakfastRepo.save(bacon);
		breakfastRepo.save(pancakes);
		breakfastRepo.save(hashbrowns);

		// Lunch
//				SampleMenu lunch = new SampleMenu();
//				sampleMenuRepo.save(lunch);
//
//				Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your preference", "5", breakfast, "");
//				Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy bacon", "3", breakfast, "");
//				Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes", "5", breakfast, "");
//				Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried hashbrown patties", "3", breakfast, "");
//
//				breakfastRepo.save(eggs);
//				breakfastRepo.save(bacon);
//				breakfastRepo.save(pancakes);
//				breakfastRepo.save(hashbrowns);
				
		// Dinner
//				SampleMenu breakfast = new SampleMenu();
//				sampleMenuRepo.save(breakfast);
//
//				Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your preference", "5", breakfast, "");
//				Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy bacon", "3", breakfast, "");
//				Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes", "5", breakfast, "");
//				Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried hashbrown patties", "3", breakfast, "");
//
//				breakfastRepo.save(eggs);
//				breakfastRepo.save(bacon);
//				breakfastRepo.save(pancakes);
//				breakfastRepo.save(hashbrowns);
				
		// Appetizer
//				SampleMenu breakfast = new SampleMenu();
//				sampleMenuRepo.save(breakfast);
//
//				Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your preference", "5", breakfast, "");
//				Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy bacon", "3", breakfast, "");
//				Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes", "5", breakfast, "");
//				Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried hashbrown patties", "3", breakfast, "");
//
//				breakfastRepo.save(eggs);
//				breakfastRepo.save(bacon);
//				breakfastRepo.save(pancakes);
//				breakfastRepo.save(hashbrowns);

		// Dessert
//				SampleMenu breakfast = new SampleMenu();
//				sampleMenuRepo.save(breakfast);
//
//				Breakfast eggs = new Breakfast("Egg Breakfast", "2 eggs cooked to your preference", "5", breakfast, "");
//				Breakfast bacon = new Breakfast("Bacon Breakfast", "3 slices of crispy bacon", "3", breakfast, "");
//				Breakfast pancakes = new Breakfast("Pancake Breakfast", "3 fluffy pancakes", "5", breakfast, "");
//				Breakfast hashbrowns = new Breakfast("Hashbrowns Breakfast", "2 fried hashbrown patties", "3", breakfast, "");
//
//				breakfastRepo.save(eggs);
//				breakfastRepo.save(bacon);
//				breakfastRepo.save(pancakes);
//				breakfastRepo.save(hashbrowns);
//

	}

}
