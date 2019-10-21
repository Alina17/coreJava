package com.practice.booking;

public class Seat {
	
	private Integer seatID;
	private Type type;
	private boolean available = true;
	
	public Seat(Integer seatID, Type type) {
		this.seatID = seatID;
		this.type = type;
		
	}
	
	public void setSeatID(Integer seatID) {
		this.seatID = seatID;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	public void book() {
		this.available = false;
	}
	
	public Integer getSeatID() {
		return seatID;
	}
	
	public Type getType() {
		return type;
	}
	public boolean isAvailable() {
		return available;
	}

}
