package com.dishmo.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private String reviewTitle;
	private String userReview;
	private String userImageUrl;

	@ManyToOne
	private SampleMenu sampleMenu;

	public Review(String reviewTitle, String userReview, String userImageUrl, SampleMenu sampleMenu) {
		this.reviewTitle = reviewTitle;
		this.userReview = userReview;
		this.userImageUrl = userImageUrl;
		this.sampleMenu = sampleMenu;
		
	}
	private Review() {
		
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public String getUserReview() {
		return userReview;
	}

	public String getUserImageUrl() {
		return userImageUrl;
	}
	
	public SampleMenu getSamplemenu() {
		return sampleMenu;
	}

}
