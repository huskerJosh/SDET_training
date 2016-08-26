package com.xpanxion;

import java.util.Scanner;

public class Multiplication {

	public Calculation performOperation(Scanner scanner){

		int multiplier=scanner.nextInt();
		int multiplicand=scanner.nextInt();

		int product = multiplier * multiplicand; 

		Calculation result = new Calculation();

		result.setTextResult(multiplier + " * " + multiplicand + " = " +product);

		return result;

	}

}
