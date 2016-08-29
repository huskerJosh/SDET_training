package com.xpanxion;

import java.util.Scanner;

public abstract class BinaryOperation {
	private String operation;

	protected abstract int calculate(int leftHandSide, int rightHandSide);	
	protected abstract boolean isValid(int leftHandSide, int rightHandSide); 	
	protected abstract String errorMessage();

	public BinaryOperation(String op){
		this.operation = op;	
	}

	public Calculation performOperation(Scanner scanner){

		int leftHandSide=scanner.nextInt();
		int rightHandSide=scanner.nextInt();

		if(isValid(leftHandSide, rightHandSide)){
			int result = calculate(leftHandSide, rightHandSide);
			return successfulCalc(leftHandSide, rightHandSide, result);
		} 
		else {
			return invalidCalculation(errorMessage());
		}
	}

	public Calculation invalidCalculation(String errorMessage){
		Calculation result = new Calculation();
		result.setTextResult(errorMessage);
		return result;
	}

	public Calculation successfulCalc(int leftHandSide, int rightHandSide, int result){
		Calculation calc = new Calculation();
		calc.setTextResult("   "+leftHandSide+" "+operation+" "+ rightHandSide+ " = "+result);
		return calc;

	}

}
