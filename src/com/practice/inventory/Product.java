package com.practice.inventory;

public class Product {
	private String name;
	private double price;
	private int id;
	private int quantaty;
	
	public Product(String name,double price, int id, int quantaty) {
		this.price = price;
		this.id = id;
		this.quantaty = quantaty;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setQuantaty(int quantaty) {
		this.quantaty = quantaty;
	}
	
	public int getID() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantaty() {
		return quantaty;
	}
	
	public String name() {
		return name;
	}

}
