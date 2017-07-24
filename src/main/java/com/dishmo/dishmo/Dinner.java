package com.dishmo.dishmo;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	
	@Entity
	public class Dinner {
		
		@Id
		@GeneratedValue
		private Long dinnerId;

		private String name;
		private String description;
		private String price;
		
		@ManyToOne
		private SampleMenu sampleMenu;

		public Long getDinnerId() {
			return dinnerId;
		}

		public String getName() {
			return name;
		}

		public String getDescription() {
			return description;
		}

		public String getPrice() {
			return price;
		}

		public SampleMenu getSampleMenu() {
			return sampleMenu;
		}

		private Dinner() {
		
		}

		public Dinner(String name, String description, String price, SampleMenu sampleMenu) {
			this.name = name;
			this.description = description;
			this.price = price;
			this.sampleMenu = sampleMenu;
		}
	}


