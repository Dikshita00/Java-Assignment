package com.thiskeyword;
/* while calling a constructor using this() keyword 
ensure it is always first statement inside another constructor */

public class C {
	C(int x){
		System.out.println(x);
	}
	C(){
		this(100);
		System.out.println(1);
	//	this(100);// error because it cannot be second statement while calling constructor
	}
	public static void main(String[] args) {
		C c1=new C();
	}

}
