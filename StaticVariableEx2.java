package com.variables;

public class StaticVariableEx2 {
	static int x=200;
	public static void main(String[] args) {
		System.out.println(x);
		
		StaticVariableEx2.x=300; //changing the value of static variable x from 200 to 300
		System.out.println(x); 
		System.out.println(x);
		
	}

}
