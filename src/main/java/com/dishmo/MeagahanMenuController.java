package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeagahanMenuController {

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
		
		@RequestMapping("/meaghan-menu")
		public String fetchAdamMenu(Model model) {
			return "/meaghan-menu-categories";
		}
		@RequestMapping("/meaghan-menu-drinks")
		public String fetchAdamMenuDrinks(Model model) {
			model.addAttribute("drinks", drinkRepo.findAll());
			model.addAttribute("alcoholicBeverages", alcoholicBeverageRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu-drinks";
		}
		@RequestMapping("/meaghan-menu-appetizers")
		public String fetchAdamMenuApps(Model model) {
			model.addAttribute("appetizers", appetizerRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu-appetizers";
		}
		@RequestMapping("/meaghan-menu-breakfasts")
		public String fetchAdamMenuBreakfasts(Model model) {
			model.addAttribute("breakfasts", breakfastRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu-breakfasts";
		}
		@RequestMapping("/meaghan-menu-lunches")
		public String fetchAdamMenuLunches(Model model) {
			model.addAttribute("lunches", lunchRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu-lunches";
		}
		@RequestMapping("/meaghan-menu-dinners")
		public String fetchAdamMenuDinners(Model model) {
			model.addAttribute("dinners", dinnerRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu-dinners";
		}
		@RequestMapping("/meaghan-menu-desserts")
		public String fetchAdamMenuDesserts(Model model) {
			model.addAttribute("desserts", dessertRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu-desserts";
		}
}
