package com.xpanxion;

import java.util.Scanner;

public class Division extends BinaryOperation{
	
	public Division(){
		super("/");
	}
	
	protected int calculate(int dividend, int divisor){
		return dividend/divisor;
	}

	protected boolean isValid(int dividend, int divisor){
		return divisor !=0;
	}
	
	protected String errorMessage(){
		return "Hey, you can't divide by zero!";
	}
	
	
}
