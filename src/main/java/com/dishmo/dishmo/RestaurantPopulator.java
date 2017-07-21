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

	@Resource
	private MenuItemRepository menuItemRepo;

	@Override
	public void run(String... args) throws Exception {

		Category indian = new Category("Indian");
		catRepo.save(indian);

		Category american = new Category("American");
		catRepo.save(american);

		Category chinese = new Category("Chinese");
		catRepo.save(chinese);

		Category fusion = new Category("Fusion");
		catRepo.save(fusion);

		Restaurant dosaCorner = new Restaurant("Dosa Corner", "1077 Old Henderson Rd. Columbus, OH 43220",
				"www.dosacornerrestaurant.com", "614-459-5515", "Mon 5-9pm, Tues-Sat 11am-9pm, Sun 12-8pm",
				"facebook.com/dosa2go", "na", "na", "yelp.com/biz/dosa-corner-columbus", "$", indian,
				"/images/mangolassi200x133.png");

		Restaurant blackDiamond = new Restaurant("Black Diamond Bar & Bistro", "141 N. 4th St. Columbus, OH 43215",
				"www.blackdiamondbarbistro.com", "419-614-5555", "Mon-Thurs 11 am - 12 am, Fri-Sun 11 am - 12 am", "na",
				"na", "na", "na", "$$", american, "/images/blackdiamond200x133.png");

		Restaurant luckyDragon = new Restaurant("Lucky Dragon", "2800 N. High St. Columbus, OH 43202",
				"www.luckydragonchineserestaurant.com", "614-263-6899", "Tues-Sat 11 am - 10 pm, Sund 11:30 am - 10 pm",
				"na", "na", "na", "www.yelp.com/biz/lucky-dragon-columbus-2", "$", chinese,
				"/images/Cashew-Chicken200x133.png");

		Restaurant coopersHawk = new Restaurant("Cooper's Hawk", "4230 The Strand Columbus, OH 43219",
				"www.coopershawkwinery.com", "614-428-6999", "Mon- Sat 11 am - 930 pm", "www.facebook.com/coopershawk",
				"na", "na", "yelp.com/biz/coopers-hawk-winery-and-restaurants-arlington-heights-2", "$$", american,
				"/images/coopers200x133.png");

		Restaurant qsBombBistro = new Restaurant("Q's Bomb A** Bistro", "3609 Trabue Rd. Columbus, OH 43228",
				"www.qsbb.com", "614-868-5490", "Mon-Sun 11 am - 9:30 pm", "facebook.com/qsbb", "na", "na", "na", "$",
				fusion, "/images/fusion200x133.png");
		
		Restaurant glourias = new Restaurant("Glouria’s", "5599 Fake St. Columbus, OH 43202", "www.glouriasplace.com", "615.555.9999", "Tues-Sat 11am - 11pm, Sun 11am-3pm", "n/a", "n/a", "n/a", "n/a", "$", fusion, "imgUrl");

		restRepo.save(dosaCorner);
		restRepo.save(blackDiamond);
		restRepo.save(luckyDragon);
		restRepo.save(coopersHawk);
		restRepo.save(qsBombBistro);
		restRepo.save(glourias);

		MenuItem baconCheeseFries = new MenuItem("Bacon Cheese Fries", blackDiamond,
				"Crispy crinkle cut fries topped with melted cheddar cheese, bacon, green onions, freshly cracked pepper and a side of sour cream and vinegar.",
				"n/a", "$6.50");

		menuItemRepo.save(baconCheeseFries);
		
		MenuItem plainDosa = new MenuItem("Plain Dosa", dosaCorner, "rice and lentil savory crepe with cilantro. served with sambar and chutney", "3", "$5.49");
		MenuItem masalaDosa = new MenuItem("Masala Dosa", dosaCorner, "rice and lentil crepes topped with onion and herbed potato curry", "4", "$6.39");
		MenuItem paneerMasalaDosa = new MenuItem("Paneer Masala Dosa", dosaCorner, "dosa topped with homemade cheese and herbed potato curry", "4", "$6.99");
		MenuItem samosa = new MenuItem("Samosa ", dosaCorner, "triangle shaped appetizer filled with homemade spicy pastry", "2", "$3.59");
		MenuItem mangoLassi= new MenuItem("Mango Lassi", dosaCorner, "traditional yogurt-based drink", "3", "$2.75");
		
		menuItemRepo.save(plainDosa);
		menuItemRepo.save(masalaDosa);
		menuItemRepo.save(paneerMasalaDosa);
		menuItemRepo.save(samosa);
		
		MenuItem pecunaSaladSalad = new MenuItem("Pecuna Salad Salad", glourias, "two heaping scoops of house-made pecan “tuna” salad made your favorite way over a bed of spring mix, topped with capers, a dollop of Just Mayo and a sprinkle of freshly ground black pepper", "4", "$14");
		MenuItem gnocchi = new MenuItem("Gnocchi with Sauce & Brussel Sprouts", glourias, "perfectly poached gnocchi with a house-made Roasted Red Pepper & butternut squash sauce, with a side of roasted brussel sprouts lightly salted", "4", "$18");
		MenuItem olivesAndCrackers = new MenuItem("Olives & Crackers", glourias, " marinated olives & garlic, crispy house-made baked water crackers, and house-made coat cheese, Cotzarella cheese, couda cheese", "4", "$14");
		MenuItem beetAndCheese = new MenuItem("Pickled Beet & Coat Cheese Platter", glourias, "house pickled beets with a pat of creamy, crumbly coconut milk “goat” cheese, house-madebaked table water crackers spinkled with pink himalayan sea salt, served on a smoked wood cuttingboard, sustainably sourced", "5", "14");
		MenuItem roseBerryGin = new MenuItem("RoseBerry Gin Garden", glourias, "house-made rose berry kombucha with four seasons gin. Refreshing with ice shavings, muddled berry leaves and fresh berries as garnish", "4", "$11");

		menuItemRepo.save(pecunaSaladSalad);
		menuItemRepo.save(gnocchi);
		menuItemRepo.save(olivesAndCrackers);
		menuItemRepo.save(beetAndCheese);
		menuItemRepo.save(roseBerryGin);
	
	}

}
