package com.practice.library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.practice.rentals.Movies;

public class Library {
	
	private List<Book> books = new ArrayList<>();
	
	
	public void add(Book book) {
		books.add(book);
	}
	
	
	
	public void checkOut(User user, String title) {
			
		for(Book book : books) {
			if(book.getTitle().equals(title) && book.isAvailable()) {
				book.checkOut();
				book.setDueDate(LocalDate.now().plusDays(7));
				book.setUser(user);
				System.out.println("Successfully checked out '"+title+"'");
				return;
			}
		}
		System.out.println("Book '"+title+"' is not available");
	}
	
	public void checkIn(User user, String title) {
		
	}
	
	public void getAvailable() {
		for(Book book : books) {
			if(book.isAvailable()) { System.out.println(book.getTitle()); }
		}
	}
	
	public void getOverdueFee() {
		
		Double overdueFees = 0D;	
		
		for(Book book : books) {	
			if(LocalDate.now().isAfter(book.getDueDate())) {
				overdueFees+= book.getOverdueFee();
				System.out.println("Book "+ book.getTitle() + " is due. Late fees calculated");
		    }
	    } 
	
			System.out.println(overdueFees);	
	
	}

}
	

	
	
	


