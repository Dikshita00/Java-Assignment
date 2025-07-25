package com.abstraction;

public class CalculatorImpl implements Calculator {

	@Override
	public void add(int x, int y) {
		System.out.println(x+y);
	}

	@Override
	public void mul(int x, int y) {
		System.out.println(x*y);
	}
	

}
