package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdamMenuController {

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
		
		@RequestMapping("/adam-menu")
		public String fetchAdamMenu(Model model) {
			return "adam-menu";
		}
		@RequestMapping("/adam-menu-drinks")
		public String fetchAdamMenuDrinks(Model model) {
			model.addAttribute("drinks", drinkRepo.findAll());
			model.addAttribute("alcoholicBeverages", alcoholicBeverageRepo.findAll());
			return "/adam-menu-categories/adam-menu-drinks";
		}
		@RequestMapping("/adam-menu-apps")
		public String fetchAdamMenuApps(Model model) {
			model.addAttribute("appetizers", appetizerRepo.findAll());
			return "/adam-menu-categories/adam-menu-appetizers";
		}
		@RequestMapping("/adam-menu-breakfasts")
		public String fetchAdamMenuBreakfasts(Model model) {
			model.addAttribute("breakfasts", breakfastRepo.findAll());
			return "/adam-menu-categories/adam-menu-breakfasts";
		}
		@RequestMapping("/adam-menu-lunches")
		public String fetchAdamMenuLunches(Model model) {
			model.addAttribute("lunches", lunchRepo.findAll());
			return "/adam-menu-categories/adam-menu-lunches";
		}
		@RequestMapping("/adam-menu-dinners")
		public String fetchAdamMenuDinners(Model model) {
			model.addAttribute("dinners", breakfastRepo.findAll());
			return "/adam-menu-categories/adam-menu-dinners";
		}
		@RequestMapping("/adam-menu-desserts")
		public String fetchAdamMenuDesserts(Model model) {
			model.addAttribute("desserts", dessertRepo.findAll());
			return "/adam-menu-categories/adam-menu-desserts";
		}
}
