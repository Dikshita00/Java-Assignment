package com.stringoperation;
//Check if a String Contains Only Digits
public class OnlyDigits {
	public static void main(String[] args) {
		String str="12344";
		boolean isDigit=str.matches("\\d+");
		System.out.println(isDigit ?"Only digits": "Contains other characters");
	}

}
