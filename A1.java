package com.finalkeyword;

public class A1 extends A {
	public void test() {
		System.out.println("Inside test() method...");
	}
	/*
	@Override
	public void test1() { // Error because we cannot override final method
		System.out.println("This method is final...");
	}  */
	
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.test();
		A a=new A();
		a.test();
	}

}
