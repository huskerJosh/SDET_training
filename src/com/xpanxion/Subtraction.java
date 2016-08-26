package com.xpanxion;

import java.util.Scanner;

public class Subtraction {
	
	public Calculation performOperation(Scanner scanner){
		
		int minuend=scanner.nextInt();
		int subtrahend=scanner.nextInt();

		int difference = minuend - subtrahend;
		
		Calculation result = new Calculation();
		
		result.setTextResult(minuend + " - " + subtrahend + " = " +difference);
		
		return result;
	}


}
