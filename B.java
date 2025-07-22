package com.accessspecifiers;

public class B extends Z {
	public static void main(String[] args) {
		Z a1=new Z();
		a1.test();//error
		System.out.println(a1.x);// private variable from another class
	}
}
