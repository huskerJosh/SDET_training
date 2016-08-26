package com.xpanxion;

import java.util.Scanner;

public class Factorial {
	
	public Calculation performOperation(Scanner scanner){
		int value = scanner.nextInt();
		int total = 1;
		
		for(int i = value; i>0; i--){
			total=total*i;	
		}
	
		System.out.println();
		
		Calculation result = new Calculation();
		
		result.setTextResult(value + "! =" + total);
		return result;
	}

}
