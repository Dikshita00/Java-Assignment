package com.thiskeyword;

public class B {
	B(int x){
		System.out.println(x);
	}
	B(){
		this(100); //we can also pass value through this() keyword
	}
	public static void main(String[] args) {
		B b1=new B();
	}

}
