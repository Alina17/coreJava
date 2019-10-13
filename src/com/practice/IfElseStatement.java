package com.practice;

public class IfElseStatement {
	
	public void conditional(int a, int b, boolean isDouble) {
		if((20 <= a && a < 50) || b < 100) {
			if(!isDouble) { System.out.println("Case 1"); }
			else {System.out.println("Case 1.5"); } 
		}
	    else if(a != b || (a > b + 20 && a < 30)) { System.out.println("Case 2"); }
	    else if((a == 20 && 0 < b && b < 100) ^ (b == 20 && 0 < a && a < 100)) {System.out.println("Case 3"); }
	}

}
