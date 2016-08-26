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
			int addend=scanner.nextInt();
			int augend=scanner.nextInt();

			int sum = addend + augend; 
			result.setTextResult(addend + " + " + augend + " = " +sum);
			break;
		case SUBTRACTION:
			int minuend=scanner.nextInt();
			int subtrahend=scanner.nextInt();

			int difference = minuend - subtrahend;
			result.setTextResult(minuend + " - " + subtrahend + " = " +difference);
			break;
		case MULTIPLICATION:
			int multiplier=scanner.nextInt();
			int multiplicand=scanner.nextInt();

			int product = multiplier * multiplicand; 

			result.setTextResult(multiplier + " * " + multiplicand + " = " +product);
			break;
		case DIVISION:
			int dividend=scanner.nextInt();
			int divisor=scanner.nextInt();

			if(divisor==0){
				result.setTextResult("I'm sorry, but you cannot divide by zero");
			}
			else{
				int quotient = dividend / divisor; 
				
				result.setTextResult("  " + dividend + " / " + divisor + " = " +quotient);
			}

			break;
		case FACTORIAL:
			int value = scanner.nextInt();
			int total = 1;
			
			for(int i = value; i>0; i--){
				total=total*i;	
			}
		
			System.out.println(value + "! =" + total);
			break;
		default:
			result.setTextResult("I'm sorry, that's not a valid choice.");

		}
		return result;

	}


}
