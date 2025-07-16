package com.variables;
// we should use local variable within created method only
public class VariablesProgram {
	
	int y=20; // Global variable inside class outside method
	static float z=34.4f;
	
	public void display() {
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) {
		int x=30; // local variable inside class inside method
		System.out.println(x); //direct access no need to create object
		
		VariablesProgram var=new VariablesProgram();
		System.out.println(var.y ); // accessed by creating object
	}

}
