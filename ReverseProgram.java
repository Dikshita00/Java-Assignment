package com.controlstatment;
//Reverse a number
public class ReverseProgram {
	public static void main(String[] args) {
		int num=1234567,rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
	}

}
