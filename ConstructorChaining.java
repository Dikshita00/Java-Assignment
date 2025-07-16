package com.thiskeyword;
//when we call one constructor from it will form chain like structure this is called constructor chaining
//This can be achieved by using this() keyword or creating object in another constructor
// ctrl+. take you to the error
public class ConstructorChaining {
	ConstructorChaining(){
		System.out.println("ConstructorChaining");
	}
	ConstructorChaining(int x){
		this();
	}
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining(100);
	}

}
