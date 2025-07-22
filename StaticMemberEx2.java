package com.polymorphism;

public class StaticMemberEx2 extends StaticMemberEx1 {
	@Override
	public  static void test() { //Error, static method can  not be overridden 
		System.out.println(300);
	}
	public static void main(String[] args) {
		StaticMemberEx2 sm1=new StaticMemberEx2();
		StaticMemberEx2 sm=new StaticMemberEx2();
		sm.test();
		sm.test();
		sm1.test();
		
		
	}

}
