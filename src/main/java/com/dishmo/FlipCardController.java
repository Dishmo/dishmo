package com.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlipCardController {

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

	@RequestMapping("flip-card-menu")
	public String fetchFlipCardMenu(Model model) {
		return "/flip-card-html/flip-card";
	}
}
