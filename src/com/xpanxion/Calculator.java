package com.xpanxion;

import java.util.Scanner;

public class Calculator {
	
	public static final int QUIT = 0;
	public static final int ADDITION=1;
	public static final int SUBTRACTION=2;
	public static final int MULTIPLICATION=3;
	public static final int DIVISION=4;
	public static final int FACTORIAL=5;
	
	public boolean supports(int requestedOperation){
		return requestedOperation >= Calculator.ADDITION && requestedOperation <= Calculator.FACTORIAL;
	}
		
	public Calculation performCalculation(int operation, String name, Scanner scanner) {
		Calculation result = new Calculation();
		switch(operation){
		case QUIT:
			result.setTextResult("Goodbye " + name);
			break;
		case ADDITION:
			Addition add = new Addition();
			result = add.performOperation(scanner);
			 
			break;
		case SUBTRACTION:

			Subtraction sub = new Subtraction();
			result = sub.performOperation(scanner);
			break;
		case MULTIPLICATION:

			Multiplication mult = new Multiplication();
			result = mult.performOperation(scanner);
			break;
		case DIVISION:
			
			Division div = new Division();
			result = div.performOperation(scanner);
			break;
		case FACTORIAL:

			Factorial fac = new Factorial();
			result = fac.performOperation(scanner);
			break;
		default:
			result.setTextResult("I'm sorry, that's not a valid choice.");

		}
		return result;

	}


}
