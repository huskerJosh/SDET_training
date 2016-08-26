package com.xpanxion;

import java.util.Scanner;

public class Addition {
	public Calculation performOperation(Scanner scanner){
		
		int addend=scanner.nextInt();
		int augend=scanner.nextInt();

		int sum = addend + augend; 
		
		Calculation result = new Calculation();
		
		result.setTextResult(addend + " + " + augend + " = " +sum);
		return result;
	}
}
