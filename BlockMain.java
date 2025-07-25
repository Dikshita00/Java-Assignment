package com.abstraction;

public class BlockMain implements BlockTwo {

	@Override
	public void firstTest() {
		System.out.println("From firstTest...");
	}

	@Override
	public void secondTest() {
		System.out.println("From secondTest...");
	}
	public static void main(String[] args) {
		BlockMain main = new BlockMain();
		main.firstTest();
		main.secondTest();
	}
	

}
