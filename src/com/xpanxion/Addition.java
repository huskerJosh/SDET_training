package com.xpanxion;

import java.util.Scanner;

public class Addition extends BinaryOperation{
	
	public Addition(){
		super("+");
	}
	
	public Calculation performOperation(Scanner scanner){
		
		int addend=scanner.nextInt();
		int augend=scanner.nextInt();

		int sum = addend + augend; 
		
		return successfulCalc(addend, augend, sum);

	}
}
