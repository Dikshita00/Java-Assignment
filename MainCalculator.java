package com.abstraction;

public class MainCalculator {
	public static void main(String[] args) {
		CalculatorImpl imp=new CalculatorImpl();
		imp.add(2, 5);
		imp.mul(12, 3);
		
		ScientificCalculator sc=new ScientificCalculator();
		sc.add(3, 3);
		sc.mul(9, 2);
	}

}
