package com.practice.rentals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.practice.rentals.Movies;

public class Summary {
	
	private List<Movies> movies = new ArrayList<>();	
	
	public void add(Movies movie) {	
		movies.add(movie);
	}
	
	public void getOverdueFee() {
		
		System.out.println("Movies overdue: ");
		System.out.println(movies
			.stream()
			.filter(movie -> movie.getDueDate().isBefore(LocalDateTime.now()))
			.peek(System.out::println)
			.map(Movies::getOverdueFee)
			.reduce(0D, (accomulator, current) -> accomulator + current)
		);
		
		
//		Double overdueFees = 0D;	
//		
//		for(Movies movie: movies) {	
//			if(LocalDateTime.now().isAfter(movie.getDueDate())) {
//				overdueFees+= movie.getOverdueFee();
//				System.out.println("Movie "+ movie.getTitle() + " is due. Late fees calculated");
//			}
//		} 
//		
//		System.out.println(overdueFees);
	}

}
