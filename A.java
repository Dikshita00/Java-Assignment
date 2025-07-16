package com.thiskeyword;
// this() keyword is use to call constructor
public class A {
	A(){
		System.out.println("A");
	}
	A(int x){
		this();
	}
	/* public void test() {
		this();// we cannot call constructor from method
	} */
	public static void main(String[] args) {
		A a1=new A(100);
	}

}
