package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MeaghanController {

	@Resource
	private DrinkRepository drinkRepo;

	@Resource
	private AppetizerRepository appetizerRepo;

	@Resource
	private BreakfastRepository breakfastRepo;

	@Resource
	private LunchRepository lunchRepo;

	@Resource
	private DinnerRepository dinnerRepo;

	@Resource
	private DessertRepository dessertRepo;

	@Resource
	private AlcoholicBeverageRepository alcoholicBeverageRepo;

	@RequestMapping("/drink-reviews-meaghan")
	public String fetchDrinkReview(@RequestParam("id") Long id, Model model) {
		Drink selectedDrinkReview = drinkRepo.findOne(id);
		model.addAttribute(selectedDrinkReview);
		return "/meaghan-html/drink-reviews-meaghan";
	}

	@RequestMapping("/appetizer-reviews-meaghan")
	public String fetchAppetizerReview(@RequestParam("id") Long id, Model model) {
		Appetizer selectedAppetizerReview = appetizerRepo.findOne(id);
		model.addAttribute(selectedAppetizerReview);
		return "/meaghan-html/appetizer-reviews-meaghan";
	}

	@RequestMapping("/breakfast-reviews-meaghan")
	public String fetchBreakfastReview(@RequestParam("id") Long id, Model model) {
		Breakfast selectedBreakfastReview = breakfastRepo.findOne(id);
		model.addAttribute(selectedBreakfastReview);
		return "/meaghan-menu-categories/meaghan-breakfast-reviews";
	}

	@RequestMapping("/lunch-reviews-meaghan")
	public String fetchLunchReview(@RequestParam("id") Long id, Model model) {
		Lunch selectedLunchReview = lunchRepo.findOne(id);
		model.addAttribute(selectedLunchReview);
		return "/meaghan-html/lunch-reviews-meaghan";
	}

	@RequestMapping("/dinner-reviews-meaghan")
	public String fetchDinnerReview(@RequestParam("id") Long id, Model model) {
		Dinner selectedDinnerReview = dinnerRepo.findOne(id);
		model.addAttribute(selectedDinnerReview);
		return "/meaghan-html/dinner-reviews-meaghan";
	}

	@RequestMapping("/dessert-reviews-meaghan")
	public String fetchDessertReview(@RequestParam("id") Long id, Model model) {
		Dessert selectedDessertReview = dessertRepo.findOne(id);
		model.addAttribute(selectedDessertReview);
		return "/meaghan-html/dessert-reviews-meaghan";
	}
}
