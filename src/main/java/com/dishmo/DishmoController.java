package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DishmoController {

	@Resource
	private BreakfastRepository breakfastRepo;
	
	@Resource
	private LunchRepository lunchRepo;
	
	@Resource
	private DinnerRepository dinnerRepo;
	
	@Resource
	private AppetizerRepository appetizerRepo;
	
	@Resource
	private DrinkRepository drinkRepo;
	
	@Resource
	private DessertRepository dessertRepo;

	@RequestMapping("/sampleMenu")
	public String fetchSampleMenu(Model model) {
		model.addAttribute("breakfasts", breakfastRepo.findAll());
		model.addAttribute("lunches", lunchRepo.findAll());
		model.addAttribute("dinners", dinnerRepo.findAll());
		model.addAttribute("appetizers", appetizerRepo.findAll());
		model.addAttribute("drinks", drinkRepo.findAll());
		model.addAttribute("desserts", dessertRepo.findAll());
		return "sample-menu";
	}

	@RequestMapping("/reviews")
	public String fetchReview(@RequestParam("id") Long id, Model model) {
		Breakfast selectedBreakfastReview = breakfastRepo.findOne(id);
		model.addAttribute(selectedBreakfastReview);
		Lunch selectedLunchReview = lunchRepo.findOne(id);
		model.addAttribute(selectedLunchReview);
		Dinner selectedDinnerReview = dinnerRepo.findOne(id);
		model.addAttribute(selectedDinnerReview);
		Appetizer selectedAppetizerReview = appetizerRepo.findOne(id);
		model.addAttribute(selectedAppetizerReview);
		Drink selectedDrinkReview = drinkRepo.findOne(id);
		model.addAttribute(selectedDrinkReview);
		Dessert selectedDessertReview = dessertRepo.findOne(id);
		model.addAttribute(selectedDessertReview);
		return "reviews";
	}

	@RequestMapping("/home")
	public String fetchHome(Model model) {
		return "dishmohome";

	}

	@RequestMapping("/dishmonav")
	public String fetchNav(Model model) {
		return "dishmonav";
	}

	@RequestMapping("/about")
	public String fetchAbout(Model model) {
		return "about";

	}

	@RequestMapping("/contact")
	public String fetchContact(Model model) {
		return "contact";

	}

	@RequestMapping("/form-submit")
	public String fetchSubmit(Model model) {
		return "form-submit";
	}
}
