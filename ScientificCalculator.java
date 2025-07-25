package com.abstraction;

public class ScientificCalculator implements Calculator{

	@Override
	public void add(int x, int y) {
		System.out.println(x*x+y*y);
	}

	@Override
	public void mul(int x, int y) {
		int num1=x*x;
		int num2=y*y;
		System.out.println(num1*num2);
	}
	

}
