package com.xpanxion;

import java.util.Scanner;

public class Division extends BinaryOperation{
	
	public Division(){
		super("/");
	}

	public Calculation performOperation(Scanner scanner){
		int dividend=scanner.nextInt();
		int divisor=scanner.nextInt();

		Calculation result = new Calculation();
		
		if(divisor==0){
			result.setTextResult("I'm sorry, but you cannot divide by zero");
		}
		else{
			int quotient = dividend / divisor; 
			
			result = successfulCalc(dividend, divisor, quotient);
		}
		return result;
	}
	
}
