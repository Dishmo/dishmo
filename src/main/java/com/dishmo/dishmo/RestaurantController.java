package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {

	@Resource
	private RestaurantRepository restRepo;

	@Resource
	private CategoryRepository catRepo;

	@RequestMapping("/restaurant")
	public String fetchRestaurantDetail(@RequestParam("id") Long id, Model model) {
		model.addAttribute("restaurantIn", restRepo.findOne(id));
		return "restaurant";
	}

	@RequestMapping("/restaurants")
	public String fetchRestaurants(Model model) {
		model.addAttribute("restaurantIn", restRepo.findAll());
		return "restaurants";
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
