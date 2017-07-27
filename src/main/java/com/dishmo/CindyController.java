package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/cindy-menu-appetizers")
	public String fetchCindyMenuApps(Model model) {
		model.addAttribute("appetizers", appetizerRepo.findAll());
		return "/cindy-html/appetizer-index";
	}

	@RequestMapping("/cindy-menu-breakfasts")
	public String fetchCindyMenuBreakfasts(Model model) {
		model.addAttribute("breakfasts", breakfastRepo.findAll());
		return "/cindy-html/breakfast-index";
	}

	@RequestMapping("/cindy-menu-lunches")
	public String fetchCindyMenuLunches(Model model) {
		model.addAttribute("lunches", lunchRepo.findAll());
		return "/cindy-html/lunch-index";
	}

	@RequestMapping("/cindy-menu-dinners")
	public String fetchCindyMenuDinners(Model model) {
		model.addAttribute("dinners", dinnerRepo.findAll());
		return "/cindy-html/dinner-index";
	}

	@RequestMapping("/cindy-menu-desserts")
	public String fetchCindyMenuDesserts(Model model) {
		model.addAttribute("desserts", dessertRepo.findAll());
		return "/cindy-html/dessert-index";
	}
}
