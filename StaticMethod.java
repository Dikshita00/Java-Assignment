package com.methods;

public class StaticMethod {
	
	public static void test() {
		System.out.println(2000);
	}
	public static int test1() {
		return 300;
	}
	public static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		StaticMethod.test();
//static belongs to class so need not to create object to call static method
		int A=StaticMethod.test1();
		System.out.println(A);
		
		int res=StaticMethod.add(25, 25);
		System.out.println(res);
	}
	
}
