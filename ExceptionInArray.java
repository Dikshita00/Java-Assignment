package com.loop;

public class ExceptionInArray {
	public static void main(String[] args) {
		try {
			int[] age=new int[3];
			age[0]=100;
			age[1]=200;
			age[2]=300;
			age[3]=400;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome");
	}

}
