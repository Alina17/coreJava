package com.practice;

import java.util.List;

import com.practice.interfaces.Animal;

public class Average {
	
	public Integer average(List <Animal> animals) {
		
		int sum =0;
		
		for(Animal animal : animals) {
			sum+=animal.getAge();
		}
		
		return sum/animals.size();
	}
}
