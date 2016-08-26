package com.xpanxion;
import java.util.*;

public class PersonalizedCalculator {
	private static final int QUIT = 0;
	private static final int ADDITION=1;
	private static final int SUBTRACTION=2;
	private static final int MULTIPLICATION=3;
	private static final int DIVISION=4;
	private static final int FACTORIAL=5;

	private static Calculation performCalculation(int operation, String name, Scanner scanner) {
		Calculation result = new Calculation();
		switch(operation){
		case QUIT:
			result.setTextResult("Goodbye " + name);
			break;
		case ADDITION:
			promptForNumbers();
			int addend=scanner.nextInt();
			int augend=scanner.nextInt();

			int sum = addend + augend; 
			result.setTextResult(addend + " + " + augend + " = " +sum);
			break;
		case SUBTRACTION:
			promptForNumbers();
			int minuend=scanner.nextInt();
			int subtrahend=scanner.nextInt();

			int difference = minuend - subtrahend;
			result.setTextResult(minuend + " - " + subtrahend + " = " +difference);
			break;
		case MULTIPLICATION:
			promptForNumbers();
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
		case 5:
			promptForNumbers();
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

	private static void promptForNumbers() {
		System.out.println("  ");
		System.out.print("Please enter numbers (separated by spaces): ");
	}
	private static void displayResultsHeader() {
		System.out.println("\nResults:" );
	}

	public static void main(String[] args){
		System.out.println("**Welcome to Personalized Calculator** \n");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hi, " + name +"\n");


		System.out.println("I can perform the following operations: ");
		System.out.println("  " + QUIT + " ) Quit");
		System.out.println("  " + ADDITION + " ) Addition");
		System.out.println("  " + SUBTRACTION + " ) Subtraction");
		System.out.println("  " + MULTIPLICATION + " ) Multiplicatoin");
		System.out.println("  " + DIVISION + " ) Division");
		System.out.println("  " + FACTORIAL + " ) Factorial");
		int operation= -1;
		
		while(operation != QUIT){
			System.out.println("\nWhat would you like to do?");
			operation=scanner.nextInt();
			Calculation answer = performCalculation(operation, name, scanner);
			displayResultsHeader();
			System.out.println(answer.getTextResult());
		}
	}
}
