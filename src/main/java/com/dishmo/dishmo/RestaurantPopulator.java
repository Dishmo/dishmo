package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestaurantPopulator implements CommandLineRunner {
	
	@Resource
	private RestaurantRepository restRepo;
	
	@Resource
	private CategoryRepository catRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category indian = new Category ("Indian");
		
		catRepo.save(indian);
		
		Restaurant dosaCorner = new Restaurant("Dosa Corner", "1077 Old Henderson Rd. Columbus, OH 43220", "www.dosacornerrestaurant.com", "614-459-5515", "Mon 5-9pm, Tues-Sat 11am-9pm, Sun 12-8pm", "facebook.com/dosa2go", "na", "na", "yelp.com/biz/dosa-corner-columbus", "$", indian, "/images/mangolassi.jpg");
	    
		restRepo.save(dosaCorner);
	}
	

}
