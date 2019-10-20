package com.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.practice.interfaces.Animal;
import com.practice.interfaces.Cat;
import com.practice.interfaces.Cow;
import com.practice.interfaces.Dog;
import com.practice.interfaces.Sheep;
import com.practice.inventory.Inventory;
import com.practice.inventory.Product;
import com.practice.rentals.Movies;
import com.practice.rentals.Summary;


public class Main {
	
	
	
	public static void main(String...args) {
			
//		UserInput userInput = new UserInput();
//		userInput.in();
//		
//		WhileLoop loop = new WhileLoop();
//		loop.counter();
		
//		IfElseStatement statement = new IfElseStatement();
//		statement.conditional(30,20,false);
		
//		MultidemesionalArray arr = new MultidemesionalArray();
//		arr.printarr(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9} });
		
//		Recursion fact = new Recursion();
//		fact.printFactorial(2);
		
//		ForEachLoop forEach = new ForEachLoop();
//		forEach.average(1,2);
		
//		Calculator calc = new Calculator();
//		calc.print(
//			calc.sum(calc.mult(5, 3), calc.div(70, 2)) 
//		);
		
//		Animal animals [] = new Animal[] {new Cat(),new Cow(),new Dog()};
//		
//		for(Animal animal:animals) {
//			
//			System.out.println(animal.sound());
//		}		
//		List<Animal> animals = new LinkedList<>();
//		 
//		Average avg = new Average();
//		
//		animals.add(new Cat(40));
//		animals.add(new Cat(30));
//		animals.add(new Cat(20));
//		animals.add(new Cat(10));
//		
//		System.out.println(avg.average(animals));
//		
		

		
		// need to make a list of doubles
		// if you have multiple doubles - where do you store them?
		
		// NOTE: linked list takes only classes
		// every primitive has a class alternative with its own functions
		

//		LinkedListAverage listAve = new LinkedListAverage();
//		System.out.println(listAve.getAverage(list));
		
		 
		 
//		Inventory fridge = new Inventory();
//		
//		fridge.add(new Product("apple",3.5,1,2));
//		fridge.add(new Product("orange",6.0,2,3));
//		
//		
//		System.out.println(fridge.getInventoryValue());
		
		Summary sum = new Summary();
		
		sum.add(
			new Movies(
				"little mermaid",
				LocalDate.of(2019, Month.OCTOBER, 10).atStartOfDay(),
				LocalDate.of(2019, Month.OCTOBER, 17).atStartOfDay()
			)
		);
		
		sum.add(
			new Movies(
				"tokyo ghoul",
				LocalDate.of(2019, Month.OCTOBER, 10).atStartOfDay(),
				LocalDate.of(2019, Month.OCTOBER, 17).atStartOfDay()
			)
		);
	

		sum.getOverdueFee();
		
	}
	
	
	
	
}
