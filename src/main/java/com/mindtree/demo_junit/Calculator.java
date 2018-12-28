package com.mindtree.demo_junit;

public class Calculator {
	
	CalculatorService calServ;
	
	Calculator(CalculatorService service){
		this.calServ = service;
	}
	
	
	public int perform(int i,int j) {
		return calServ.add(i, j)*i;
	}
}
