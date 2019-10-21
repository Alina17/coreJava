package com.practice.booking;

public enum Type {
	
	FIRSTCLASS("Luxary",500),
	REGULAR("Regular",100),
	PLUS("Extra space",250);
	
	private final String desc;
	private final Integer prices;
	
	Type(String description, Integer price) {
		desc = description;
		prices = price;
	}
	
	public String getDescription() {
		return desc;
	}
	
	public Integer getPrice() {
		return prices;
	}

}
