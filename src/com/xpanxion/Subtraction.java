package com.xpanxion;

import java.util.Scanner;

public class Subtraction extends BinaryOperation{
	
	public Subtraction(){
		super("-");
	}
	
	public Calculation performOperation(Scanner scanner){
		
		int minuend=scanner.nextInt();
		int subtrahend=scanner.nextInt();

		int difference = minuend - subtrahend;
		
		return successfulCalc(minuend, subtrahend, difference);
	}


}
