package com.practice;

/*
 * Factorial (example of recursion
 */

public class Recursion {

	public void printFactorial(int n) {
		System.out.println(calculateFactorial(n));
	}
	
	private int calculateFactorial(int n) {
		if(n==1) { return 1; }
		else { return n*calculateFactorial(n-1); }
	}
}
