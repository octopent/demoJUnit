package com.mindtree.demo_junit;

public class App {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(new CalculatorService() {
			public int add(int i, int j) {
				return 0;
			}
		});
		cal.perform(2, 3);
	}
}
