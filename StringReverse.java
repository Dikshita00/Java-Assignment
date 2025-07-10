package com.stringoperation;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Interview";
		String reversed=new StringBuffer(str).reverse().toString();
		System.out.println(reversed);
	}

}
