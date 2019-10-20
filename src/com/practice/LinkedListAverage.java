package com.practice;

import java.util.List;

public class LinkedListAverage {
	
	/** @NOTE: Java 8. Use this for reference
	 * int sum1 = list.stream().reduce(0, Integer::sum);
	 * */
	public Double getAverage(List<Double>list) {
		
		double average=0;
		
		for(double y:list) { average+=y;}
		
		return average/list.size();
		

	}	
}
