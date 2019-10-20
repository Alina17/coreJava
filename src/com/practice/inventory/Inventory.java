package com.practice.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private List<Product> products = new ArrayList<>(); 
	
	public void add(Product product) {
		products.add(product);
	}
	
	public Double getInventoryValue() {
		Double inventoryValue = 0D;
		
		for(Product product : products) {
			inventoryValue += product.getPrice()*product.getQuantaty();
		}
		
		
		return inventoryValue;
	} 
}
