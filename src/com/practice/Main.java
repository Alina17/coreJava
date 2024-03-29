package com.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.practice.bank.Account;
import com.practice.bank.BusinessAcount;
import com.practice.bank.CheckingAccount;
import com.practice.bank.SavingAccount;
import com.practice.booking.Plane;
import com.practice.grades.Student;
import com.practice.grades._Class;
import com.practice.interfaces.Animal;
import com.practice.interfaces.Cat;
import com.practice.interfaces.Cow;
import com.practice.interfaces.Dog;
import com.practice.interfaces.Sheep;
import com.practice.inventory.Inventory;
import com.practice.inventory.Product;
import com.practice.library.Book;
import com.practice.library.Library;
import com.practice.library.User;
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
		
//		Summary sum = new Summary();
//		
//		sum.add(
//			new Movies(
//				"little mermaid",
//				LocalDate.of(2019, Month.OCTOBER, 10).atStartOfDay(),
//				LocalDate.of(2019, Month.OCTOBER, 17).atStartOfDay()
//			)
//		);
//		
//		sum.add(
//			new Movies(
//				"tokyo ghoul",
//				LocalDate.of(2019, Month.OCTOBER, 10).atStartOfDay(),
//				LocalDate.of(2019, Month.OCTOBER, 17).atStartOfDay()
//			)
//		);
//	
//
//		sum.getOverdueFee();
//		
//		Plane plane = new Plane();
//		
//		plane.bookSeat(1);
//		plane.bookSeat(1);
//		plane.bookSeat(7);
//		
//		plane.getAvailableSeats();
//		plane.getTotalAmount();
		
//		_Class calc = new _Class();
//		
//		calc.add(new Student("Vasya",46));
//		calc.add(new Student("Lusya",98));
//		calc.add(new Student("Jade",35));
//		calc.add(new Student("Julia",85));
//		calc.add(new Student("Boris",67));
//		
//		calc.getAverage();
		
		
		
//		Account checking = new CheckingAccount(900.00);
//		Account saving = new SavingAccount(563000.00);
//		Account business = new BusinessAcount(1000000.00);
		
		
//		checking.deposit(350.50);
//		System.out.println(checking.getBalance());
//		checking.withdraw(1250.5);
//		System.out.println(checking.getBalance());
//		checking.transfer(saving,100.00);
//		System.out.println(saving.getBalance());
		
		
		
		Library library = new Library();
		
		library.add(new Book("Harry Potter", 13654789, 860));
		library.add(new Book("Harry Potter 2", 13654659, 561));
		library.add(new Book("Harry Potter 3", 1984219, 987));
		library.add(new Book("Harry Potter 4", 13587654, 753));
		library.add(new Book("Harry Potter 5", 13933671, 821));
		
		
		
		library.checkOut(new User("Alina"), "Harry Potter");
		library.checkOut(new User("Alina"), "Harry Potter");
		
		
		library.getAvailable();
		
	}
	
	
	
	
}
