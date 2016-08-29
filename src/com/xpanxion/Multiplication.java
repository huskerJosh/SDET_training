package com.xpanxion;

import java.util.Scanner;

public class Multiplication extends BinaryOperation{
	
	public Multiplication(){
		super("*");
	}

	public Calculation performOperation(Scanner scanner){

		int multiplier=scanner.nextInt();
		int multiplicand=scanner.nextInt();

		int product = multiplier * multiplicand; 

		return successfulCalc(multiplier, multiplicand, product);

	}

}
