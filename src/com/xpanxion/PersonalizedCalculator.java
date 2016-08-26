package com.xpanxion;
import java.util.*;

public class PersonalizedCalculator {


	
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
		System.out.println("  " + Calculator.QUIT + " ) Quit");
		System.out.println("  " + Calculator.ADDITION + " ) Addition");
		System.out.println("  " + Calculator.SUBTRACTION + " ) Subtraction");
		System.out.println("  " + Calculator.MULTIPLICATION + " ) Multiplicatoin");
		System.out.println("  " + Calculator.DIVISION + " ) Division");
		System.out.println("  " + Calculator.FACTORIAL + " ) Factorial");
		int operation= -1;
		
		Calculator instance = new Calculator();
		
		while(operation != Calculator.QUIT){
			System.out.println("\nWhat would you like to do?");
			operation=scanner.nextInt();
			if (instance.supports(operation)){
				promptForNumbers();
			}
			Calculation answer = instance.performCalculation(operation, name, scanner);
			displayResultsHeader();
			System.out.println(answer.getTextResult());
		}
	}
}
