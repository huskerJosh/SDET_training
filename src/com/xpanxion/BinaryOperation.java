package com.xpanxion;

public class BinaryOperation {
	private String operation;
	
	public BinaryOperation(String op){
		this.operation = op;	
	}
	
	public Calculation successfulCalc(int leftHandSide, int rightHandSide, int result){
		Calculation calc = new Calculation();
		calc.setTextResult("   "+leftHandSide+" "+operation+" "+ rightHandSide+ " = "+result);
		return calc;
		
	}
	
}
