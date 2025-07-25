package com.multipleinheritance;

public class MainClass implements FirstInterfacce , SecondInterface {

	@Override
	public void test1() {
		System.out.println("This Is From SecondInterface");
	}

	@Override
	public void test() {
		System.out.println("This Is From FirstInterface ");
	}
	public static void main(String[] args) {
		MainClass mc=new MainClass();
		mc.test();
		mc.test1();
	}

}
