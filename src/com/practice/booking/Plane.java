package com.practice.booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class Plane {
	
	private static final int planeSize = 30,
		firstClassSize = 10,
		plusClassSize = 5;
		//regularClassSize = 15;	
	private Seat [] seat = new Seat[planeSize];
	
	public Plane() {
		int i = 1;
		while(i <= planeSize) {
			if(i<=firstClassSize) seat[i-1] = new Seat(i, Type.FIRSTCLASS);
			else if(firstClassSize < i && i <= firstClassSize+plusClassSize) seat[i-1] = new Seat(i, Type.PLUS);
			else seat[i-1] = new Seat(i, Type.REGULAR);
			i++;
		}
	}
	
	
	public void bookSeat(int index) {
		if(!(0 < index && index <= planeSize)) {
			System.out.println("Seat does not exist :(");
			return;
		}
		
		if(!seat[index-1].isAvailable()) {
			System.out.println("Seat is taken!");
			return;
		} 
		seat[index-1].book();
		System.out.println("Seat successfully booked");
	}
	
	public void getAvailableSeats() {
		List<String> avalSeat = new LinkedList<>();
		for(int i = 0; i < planeSize; i++) {
			if(seat[i].isAvailable()) avalSeat.add(""+ seat[i].getSeatID());
		}
		System.out.println(String.join(",", avalSeat));
	}
	
	public void getTotalAmount( ) {
		int amount = 0;
		 
		for(int i = 0; i < planeSize; i++) {
			if(!seat[i].isAvailable()) { amount+=seat[i].getType().getPrice(); }	
		}
		System.out.println(amount);	
		
	}
	
	
	
	
}
