package com.practice;

public class ForEachLoop {

	public void average(double...numbers) {
        double total = 0;

        for(double y:numbers) { total+=y; }
        
        System.out.println(total/numbers.length);
	}   

}
