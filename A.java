package com.finalkeyword;
/*
 * If you make a variable final we cannot change it's value 
 * If you make static/non-static variable final then initialization is mandatory
 * If you make a method final then overriding is not allowed
 * If you make a class final then inheritance is not allowed
 */
public class A {
	public void test() {
		System.out.println("Inside test() method...");
	}
	final public void test1() {
		System.out.println("This method is final...");
	}
	

}
