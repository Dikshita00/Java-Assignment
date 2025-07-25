package com.abstraction;

/*
 * Interface in java - abstraction
 
 * An interface can consist only incomplete method/abstract method in it(Java Version 7)
 * All variable in an interface by default are final & static
 * Interfaces defines what needs to be developed and not how it is to be developed
 * Interface are like contract that a class follows, and the class has to implements these methods
 * An object of interface can not be created, because object cannot have incomplete method in it
 * Loosely coupled
 * It forces all the implementation classes to have method same resulting in good design

 */
public interface A {
	// public void test() {} //-- error complete method are not allowed in interface

	public void newTest(); // incomplete method

}
