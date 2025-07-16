package com.variables;

public class A {
	int x=10;
	int y;
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x);
		
		A a2=new A();
		a2.x=20;
		System.out.println(a2.x);
		
		A a3=new A();
		System.out.println(a3.x);
		System.out.println(a3.y);//not mandatory to initialize non static variable, depending on data type automatically default will get store 
	}

}
