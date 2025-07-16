package com.variables;
// static variable are created inside class outside methods with static keyword
// to access static variable we will use below option
// a.  ClassName.variableName
// b.  variableName (Constrains)
// c.  objectAddress.variableName(Wrong Approach but will work) 

public class StaticVariable {
	static int x;
	public static void main(String[] args) {
		System.out.println(x);// by variableName
		System.out.println(StaticVariable.x); // ClassName.variableName
		
		StaticVariable obj=new StaticVariable();
		System.out.println(obj.x); //objectAddress.variableName(Wrong Approach but will work) 
		//automatically get converted into StaticVariable.x
	}
	

}
