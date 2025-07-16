package com.variables;
// non static variable belongs to object static variable belongs to class
public class VariableEx {
	
	int x=10; //non static variable
	static int y=30; //static variable
	public static void main(String[] args) {
		
		VariableEx v=new VariableEx();
	    System.out.println(v.x);
	    
	    System.out.println(y);
	    System.out.println(VariableEx.y);
	    
	    
	}

}
