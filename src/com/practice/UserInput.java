package com.practice;

import java.util.Scanner;

/**
 * Scanner
 * */
public class UserInput {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public void in() {
		System.out.print("Print your word here: ");
		System.out.println(scanner.nextLine());
	}
}
