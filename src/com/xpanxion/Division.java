package com.xpanxion;

import java.util.Scanner;

public class Division {

	public Calculation performOperation(Scanner scanner){
		int dividend=scanner.nextInt();
		int divisor=scanner.nextInt();

		Calculation result = new Calculation();
		
		if(divisor==0){
			result.setTextResult("I'm sorry, but you cannot divide by zero");
		}
		else{
			int quotient = dividend / divisor; 
			
			result.setTextResult("  " + dividend + " / " + divisor + " = " +quotient);
		}
		return result;
	}
	
}
