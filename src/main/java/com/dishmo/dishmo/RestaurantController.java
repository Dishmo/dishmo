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
	
	@RequestMapping ("/restaurant")
	public String fetchRestaurantDetail(@RequestParam("id") Long id, Model model) {
		model.addAttribute("restaurantIn", restRepo.findOne(id));
		return "restaurant";
	}

}
