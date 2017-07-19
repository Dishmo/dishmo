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
				"/images/mangolassi.jpg");

		Restaurant blackDiamond = new Restaurant("Black Diamond Bar & Bistro", "141 N. 4th St. Columbus, OH 43215",
				"www.blackdiamondbarbistro.com", "419-614-5555", "Mon-Thurs 11 am - 12 am, Fri-Sun 11 am - 12 am", "na",
				"na", "na", "na", "$$", american, "/images/blackdiamond.jpg");

		Restaurant luckyDragon = new Restaurant("Lucky Dragon", "2800 N. High St. Columbus, OH 43202",
				"www.luckydragonchineserestaurant.com", "614-263-6899", "Tues-Sat 11 am - 10 pm, Sund 11:30 am - 10 pm",
				"na", "na", "na", "www.yelp.com/biz/lucky-dragon-columbus-2", "$", chinese,
				"/images/Cashew-Chicken.jpg");

		Restaurant coopersHawk = new Restaurant("Cooper's Hawk", "4230 The Strand Columbus, OH 43219",
				"www.coopershawkwinery.com", "614-428-6999", "Mon- Sat 11 am - 930 pm", "www.facebook.com/coopershawk",
				"na", "na", "yelp.com/biz/coopers-hawk-winery-and-restaurants-arlington-heights-2", "$$", american,
				"/images/coopers.jpg");

		Restaurant qsBombBistro = new Restaurant("Q's Bomb A** Bistro", "3609 Trabue Rd. Columbus, OH 43228",
				"www.qsbb.com", "614-868-5490", "Mon-Sun 11 am - 9:30 pm", "facebook.com/qsbb", "na", "na", "na", "$",
				fusion, "/images/fusion.jpg");

		restRepo.save(dosaCorner);
		restRepo.save(blackDiamond);
		restRepo.save(luckyDragon);
		restRepo.save(coopersHawk);
		restRepo.save(qsBombBistro);
	}

}
