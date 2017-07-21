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
		MenuItem allAmericanBurger = new MenuItem("All American Burger", blackDiamond,
				"Quarter Pound Burger cooked perfectly to order with red onions, lettuce, tomato, pickle and Black Diamond sauce. Served on a fresh toasted sesame seed bun. Comes with a side of crinkle cut fries.",
				"n/a", "$12.00");
		MenuItem angusPrimeRibeye = new MenuItem("12 oz Angus Prime Ribeye", blackDiamond,
				"Served with grilled asparagus and wild rice.",
				"n/a", "$21.00");
		MenuItem porterhouse = new MenuItem("22 oz Porterhouse", blackDiamond,
				"Served with candied bacon brussel sprouts and a baked sweet potato.",
				"n/a", "$21.00");
		MenuItem ovenRoastedChickenBreast = new MenuItem("Oven Roasted Chicken Breast", blackDiamond,
				"Fresh, juicy, oven roasted chicken breast perfectly seasoned with herbs. Comes with roasted corn and garlic mashed red potatoes.",
				"n/a", "$14.00");

		menuItemRepo.save(baconCheeseFries);
		menuItemRepo.save(allAmericanBurger);
		menuItemRepo.save(angusPrimeRibeye);
		menuItemRepo.save(porterhouse);
		menuItemRepo.save(ovenRoastedChickenBreast);
		
		MenuItem steamedDumplings = new MenuItem("Steamed Dumplings", luckyDragon,
				"A healthy portion of delicious dumplings filled with pork.",
				"n/a", "$6.25");
		MenuItem chickenWithCashewNut = new MenuItem("Chicken with Cashew Nut", luckyDragon,
				"A perfect ratio of chicken to cashews in a brown sauce over a bed or steamed or fried rice.",
				"n/a", "$9.95");
		MenuItem shrimpLoMein = new MenuItem("Shrimp Lo Mein", luckyDragon,
				"Lo Mein noodles with shrimp in a light sauce.",
				"n/a", "$9.95");
		MenuItem happyFamily = new MenuItem("Happy Family", luckyDragon,
				"Shrimp, chicken, beef and pork stir-fried with vegetables in delicious brown sauce.",
				"n/a", "$13.25");
		MenuItem maiTai = new MenuItem("Mai Tai", luckyDragon,
				"Rum, coconut rum, grenadine, pineapple juice, orange juice. Delicious!",
				"n/a", "$4.95");
		
		menuItemRepo.save(steamedDumplings);
		menuItemRepo.save(chickenWithCashewNut);
		menuItemRepo.save(shrimpLoMein);
		menuItemRepo.save(happyFamily);
		menuItemRepo.save(maiTai);
		
		MenuItem shortRibRisotto = new MenuItem("Short Rib Risotto", coopersHawk,
				"Carnaroli Rice, Mushroom, Sweet Onion, White Wine, Shaved Parmesan, White Truffle Oil.",
				"3.5", "$24.99");
		MenuItem jambalaya = new MenuItem("Jambalaya", coopersHawk,
				"Chicken, Shrimp, Andouille, Onion, Tomato, Peppers, Jasmine Rice.",
				"4.0", "$18.99");
		MenuItem coopersHawkCalamari = new MenuItem("Cooper's Hawk Calamari", coopersHawk,
				"Sweet Chili-Ponzu Glaze, Cilantro, Sesame-Sriracha Aioli.",
				"4.2", "$12.99");
		MenuItem romanceRed = new MenuItem("83 Romance Red", coopersHawk,
				"Concord grapes with hints of maraschino cherry and spice.",
				"4.7", "$12.99");
		
		menuItemRepo.save(shortRibRisotto);
		menuItemRepo.save(jambalaya);
		menuItemRepo.save(coopersHawkCalamari);
		menuItemRepo.save(romanceRed);

		MenuItem kitchenSink = new MenuItem("Kitchen Sink", qsBombBistro,
				"Two eggs, Home fries, veggie sausage and toast served with three slices of french toast", "4.3",
				"$7.50");
		MenuItem gingeredCarrot = new MenuItem("Gingered Carrot Soup with Crème Fraîche", qsBombBistro,
				"The crème fraîche adds a touch of creativity to this flavorful gingered carrot soup.", "4.25",
				"$6.50");
		MenuItem sesameSalmon = new MenuItem("Sesame Encusted Salmon", qsBombBistro,
				"Shrimp, Andouille, Onion, Tomato, Peppers, Jasmine Rice", "4.80", "$22.99");
		MenuItem freshRolls = new MenuItem("Fresh Rolls", qsBombBistro,
				"Two rice wrapper rolls stuffed with rice noodles, mint leaves, cucumber, bean sprouts and crushed peanuts. Served with a sweet hoisin sauce and topped with crushed peanuts. Served cold.",
				"4.75", "$7.95");
		MenuItem peachGingerBeer = new MenuItem("Peach Ginger Beer", qsBombBistro,
				"The traditional cocktail of vodka + ginger beer + lime juice with a refreshing summer twist with peach vodka, fresh basil and lemon juice.",
				"4.52", "$9.00");

		menuItemRepo.save(kitchenSink);
		menuItemRepo.save(gingeredCarrot);
		menuItemRepo.save(sesameSalmon);
		menuItemRepo.save(freshRolls);
		menuItemRepo.save(peachGingerBeer);
		
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
