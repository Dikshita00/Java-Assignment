package com.variables;

public class D {
	public static void main(String[] args) {
		D d=new D();
		String x=d.test();
		System.out.println(x);
		
		d.display();
		int y=d.marks();
		System.out.println(y);
	}
	public String test() {
		return "Mike";
	}
	public void display() {
		System.out.println("Inside display method...");
	}
	public int marks() {// if the method is not void it is mandatory to return value
		System.out.println("inside marks msg...");
		return 100;
	}
	

}
