package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CindyController {

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

	@RequestMapping("cindy-menu")
	public String fetchCindyMenu(Model model) {
		return "/cindy-html/cindy-index";
	}

	@RequestMapping("/cindy-menu-drinks")
	public String fetchCindyMenuDrinks(Model model) {
		model.addAttribute("drinks", drinkRepo.findAll());
		model.addAttribute("alcoholicBeverages", alcoholicBeverageRepo.findAll());
		return "/cindy-html/drinks-index";
	}

	@RequestMapping("/drink-reviews-cindy")
	public String fetchDrinkReview(@RequestParam("id") Long id, Model model) {
		Drink selectedDrinkReview = drinkRepo.findOne(id);
		model.addAttribute(selectedDrinkReview);
		return "/cindy-html/drink-reviews-cindy";
	}

	@RequestMapping("/cindy-menu-appetizers")
	public String fetchCindyMenuApps(Model model) {
		model.addAttribute("appetizers", appetizerRepo.findAll());
		return "/cindy-html/appetizer-index";
	}

	@RequestMapping("/appetizer-reviews-cindy")
	public String fetchAppetizerReview(@RequestParam("id") Long id, Model model) {
		Appetizer selectedAppetizerReview = appetizerRepo.findOne(id);
		model.addAttribute(selectedAppetizerReview);
		return "/cindy-html/appetizer-reviews-cindy";
	}

	@RequestMapping("/cindy-menu-breakfasts")
	public String fetchCindyMenuBreakfasts(Model model) {
		model.addAttribute("breakfasts", breakfastRepo.findAll());
		return "/cindy-html/breakfast-index";
	}

	@RequestMapping("/breakfast-reviews-cindy")
	public String fetchBreakfastReview(@RequestParam("id") Long id, Model model) {
		Breakfast selectedBreakfastReview = breakfastRepo.findOne(id);
		model.addAttribute(selectedBreakfastReview);
		return "/cindy-html/breakfast-reviews-cindy";
	}

	@RequestMapping("/cindy-menu-lunches")
	public String fetchCindyMenuLunches(Model model) {
		model.addAttribute("lunches", lunchRepo.findAll());
		return "/cindy-html/lunch-index";
	}

	@RequestMapping("/lunch-reviews-cindy")
	public String fetchLunchReview(@RequestParam("id") Long id, Model model) {
		Lunch selectedLunchReview = lunchRepo.findOne(id);
		model.addAttribute(selectedLunchReview);
		return "/cindy-html/lunch-reviews-cindy";
	}

	@RequestMapping("/cindy-menu-dinners")
	public String fetchCindyMenuDinners(Model model) {
		model.addAttribute("dinners", dinnerRepo.findAll());
		return "/cindy-html/dinner-index";
	}

	@RequestMapping("/dinner-reviews-cindy")
	public String fetchDinnerReview(@RequestParam("id") Long id, Model model) {
		Dinner selectedDinnerReview = dinnerRepo.findOne(id);
		model.addAttribute(selectedDinnerReview);
		return "/cindy-html/dinner-reviews-cindy";
	}

	@RequestMapping("/cindy-menu-desserts")
	public String fetchCindyMenuDesserts(Model model) {
		model.addAttribute("desserts", dessertRepo.findAll());
		return "/cindy-html/dessert-index";
	}

	@RequestMapping("/dessert-reviews-cindy")
	public String fetchDessertReview(@RequestParam("id") Long id, Model model) {
		Dessert selectedDessertReview = dessertRepo.findOne(id);
		model.addAttribute(selectedDessertReview);
		return "/cindy-html/dessert-reviews-cindy";
	}
}
