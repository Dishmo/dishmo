package com.dishmo.dishmo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	private String reviewTitle;

	private String userReview;

	private String userImageUrl;

	@ManyToOne
	private MenuItem menuItem;

	public Review(String reviewTitle, String userReview, String userImageUrl, MenuItem menuItem) {
		this.reviewTitle = reviewTitle;
		this.userReview = userReview;
		this.userImageUrl = userImageUrl;
		this.menuItem = menuItem;
		
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

	public MenuItem getMenuItem() {
		return menuItem;
	}

}
