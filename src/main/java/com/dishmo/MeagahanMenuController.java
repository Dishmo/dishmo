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
		public String fetchMeaghanMenu(Model model) {
			model.addAttribute("drinks", drinkRepo.findAll());
			model.addAttribute("alcoholicBeverages", alcoholicBeverageRepo.findAll());
			model.addAttribute("appetizers", appetizerRepo.findAll());
			model.addAttribute("breakfasts", breakfastRepo.findAll());
			model.addAttribute("lunches", lunchRepo.findAll());
			model.addAttribute("dinners", dinnerRepo.findAll());
			model.addAttribute("desserts", dessertRepo.findAll());
			return "/meaghan-menu-categories/meaghan-menu";
		}
	
}
