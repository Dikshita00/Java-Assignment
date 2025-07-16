package com.variables;

public class StaticMethodEx {
	public static void test() {
		System.out.println("Test Clear...");
	}
	public static void main(String[] args) {
		StaticMethodEx.test(); //accessed by ClassName.MethodName(); // calling from main method because main runs automatically
		
	}

}
