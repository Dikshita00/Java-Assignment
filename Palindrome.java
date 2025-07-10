package com.stringoperation;

public class Palindrome {
	public static void main(String[] args) {
		String str="lol";
		String rev=new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(rev));
		
	}

}
