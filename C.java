package com.variables;
// static variable work anywhere inside the program where as local variable only work within only method it is created
public class C {
	static int A= 100;
	
	
	public static void main(String[] args) {
		int x= 10;
		System.out.println(x);
		System.out.println(A);
		System.out.println(C.A=200);//changing value of static variable
	}
	public void run() {
		System.out.println(A);
		System.out.println(C.A);
	}

}
