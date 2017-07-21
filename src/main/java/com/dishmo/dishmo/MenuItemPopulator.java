package com.dishmo.dishmo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuItemPopulator implements CommandLineRunner {

	@Resource
	private RestaurantRepository restRepo;

	@Resource
	private CategoryRepository catRepo;
	
	@Resource
	private MenuItemRepository menuItemRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		MenuItem baconCheeseFries = new MenuItem("Bacon Cheese Fries", "Crispy crinkle cut fries topped with melted cheddar cheese, bacon, green onions, freshly cracked pepper and a side of sour cream and vinegar.", "n/a", "$6.50");
		
		menuItemRepo.save(baconCheeseFries);
	}

	
}
