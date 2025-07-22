package com.accessspecifiers;

public class A {
	protected int x=900;
	protected void test() {
		System.out.println(800);
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.test();
		System.out.println(a1.x);
	}

}
