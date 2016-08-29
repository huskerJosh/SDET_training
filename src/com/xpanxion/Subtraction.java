package com.xpanxion;


public class Subtraction extends BinaryOperation{
	
	public Subtraction(){
		super("-");
	}
	
	protected int calculate(int minuend, int subtrahend){
		return minuend - subtrahend;
	}
	
	protected boolean isValid(int minuend, int subtrahend){
		return true;
	}
	
	protected String errorMessage(){
		return "";
	}

}
