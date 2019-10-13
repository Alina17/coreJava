package com.practice;

public class MultidemesionalArray {
	
	public void printarr(int x[][]) {
		for(int i  = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) { System.out.print(x[i][j]+"\t"); }
			System.out.println();
		}
    }
}
