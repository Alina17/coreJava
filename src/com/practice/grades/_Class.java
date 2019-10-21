package com.practice.grades;

import java.util.ArrayList;
import java.util.List;


public class _Class {
	

	private List<Student> students  = new ArrayList<>();
	
	public void add(Student student) {
		students.add(student);
	}
	
	
	
	
	
	public void getAverage() {
		
		int sum = 0;
			
		for(Student students : students) { sum+=students.getScore();}
		
		double average = sum/students.size();
		
		System.out.println(average);
		
		if(average <= 50) {
			System.out.println("Average grade is F");
		}else if (50 < average && average < 65 ) {
			System.out.println("Average grade is D");
		}else if (65 < average && average < 80) {
			System.out.println("Average grade is C");
		}else if (80 < average && average < 95) {
			System.out.println("Average grade is B");	
		}else if(95 < average && average <=100) {
			System.out.println("Average grade is A");
		}	
		
	}
}

