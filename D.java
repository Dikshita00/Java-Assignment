package com.thiskeyword;

//this() is a special reference variable that holds object address

public class D {
	int x; //----> non static 
	
	D(int x){ //----> Local variable
		this.x=x;
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		D d1=new D(100);
	}

}
