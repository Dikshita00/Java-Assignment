package com.accessspecifiers;
 // if a constructor is made default then its object can be created in same class/same package but not outside the package

public class DefaultConstructor {
	DefaultConstructor(){
		
	}
	public static void main(String[] args) {
		DefaultConstructor dc=new DefaultConstructor();
	}

}
