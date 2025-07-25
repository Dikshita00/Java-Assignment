package com.multipleinheritance;
//when we have to use both extends and implements write extends first then implement
public class AThree extends AOne implements ATwo {

	@Override
	public void test1() {
		System.out.println("From interface...");
	}
	public static void main(String[] args) {
		AThree a3=new AThree();
		a3.test();
		a3.test1();
	}

}
