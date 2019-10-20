package com.practice.rentals;

import java.time.LocalDateTime;

public class Movies {
	
	private String title;
	private static final Double overdueFee = 5.5D;
	private LocalDateTime rentDate;
	private LocalDateTime dueDate;
	
	public Movies(String title, LocalDateTime rentDate, LocalDateTime dueDate) {		
		this.title = title;
		this.dueDate = dueDate;
		this.rentDate = rentDate;
		
	}
	
	public void setTitle(String title) {
		this.title = title;		
	}
	
	public String getTitle() {
		return title;
	}

	public Double getOverdueFee() {
		return overdueFee;
	}

	public LocalDateTime getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDateTime rentDate) {
		this.rentDate = rentDate;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override 
	public String toString() {
		return "Title: "+this.title;
	}
}
