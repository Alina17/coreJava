package com.practice.library;
import java.time.LocalDate;


public class Book {
	
	private String title;
	private long isbn;
	private int page_count;
	private boolean isAvailable = true;
	private LocalDate dueDate = null;
	private User user = null;
	private static final Double overdueFee = 5.5D;
	
	
	public Book(String title, long isbn, int page_count) {
		this.title = title;
		this.isbn = isbn;
		this.page_count = page_count;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setISBN(long isbn) {
		this.isbn = isbn;
		
	}
	
	public void setPageCount(int page_count) {
		this.page_count = page_count;
	}
	
	public Double getOverdueFee() {
		return overdueFee;
	}
	
	public String getTitle() {
		return title;
	}
	
	public long getISBN() {
		return isbn;
	}
	
	public int getPageCount() {
		return page_count;
	}
	
	public void checkOut() {
		this.isAvailable = false;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	
	
	@Override 
	public String toString() {
		return "Title: "+this.title;
	}
	

}
