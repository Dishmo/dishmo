package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MichaelMenuController {

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
		
		@RequestMapping("/michael-menu")
		public String fetchMichaelMenu(Model model) {
			return "/michael-menu-categories/michael-menu";
		}
		@RequestMapping("/michael-menu-drinks")
		public String fetchMichaelMenuDrinks(Model model) {
			model.addAttribute("drinks", drinkRepo.findAll());
			model.addAttribute("alcoholicBeverages", alcoholicBeverageRepo.findAll());
			return "/michael-menu-categories/michael-menu-drinks";
		}
		@RequestMapping("/michael-menu-appetizers")
		public String fetchMichaelMenuApps(Model model) {
			model.addAttribute("appetizers", appetizerRepo.findAll());
			return "/michael-menu-categories/michael-menu-appetizers";
		}
		@RequestMapping("/michael-menu-breakfasts")
		public String fetchMichaelMenuBreakfasts(Model model) {
			model.addAttribute("breakfasts", breakfastRepo.findAll());
			return "/michael-menu-categories/michael-menu-breakfasts";
		}
		@RequestMapping("/michael-menu-lunches")
		public String fetchMichaelMenuLunches(Model model) {
			model.addAttribute("lunches", lunchRepo.findAll());
			return "/michael-menu-categories/michael-menu-lunches";
		}
		@RequestMapping("/michael-menu-dinners")
		public String fetchMichaelMenuDinners(Model model) {
			model.addAttribute("dinners", dinnerRepo.findAll());
			return "/michael-menu-categories/michael-menu-dinners";
		}
		@RequestMapping("/michael-menu-desserts")
		public String fetchMichaelMenuDesserts(Model model) {
			model.addAttribute("desserts", dessertRepo.findAll());
			return "/michael-menu-categories/michael-menu-desserts";
		}
}