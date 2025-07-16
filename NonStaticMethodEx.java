package com.variables;

public class NonStaticMethodEx {
	public void placeOrder() {
		System.out.println("Order has been placed...");
	}
	public static void main(String[] args) {  //main method always called automatically
		NonStaticMethodEx nonstatic=new NonStaticMethodEx();
		nonstatic.placeOrder();
		
	}

}
