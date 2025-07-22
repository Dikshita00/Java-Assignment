package com.inheritance.program;

public class Root {
	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		a1.sleep();
		
		Dog d1=new Dog();
		d1.eat();
		d1.sleep();
		
		Cat c1=new Cat();
		c1.eat();
		c1.sleep();
	}

}
