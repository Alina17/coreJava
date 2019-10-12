package com.practice;

/**
 * Prints only even numbers using while loop
 */
public class WhileLoop {
	
	public void counter() {
		int x = 0;
		 
		while(x <= 50) {			 
			if(x%2 == 0) { System.out.println(x); }
			x++; 
		}
	 }	
}
