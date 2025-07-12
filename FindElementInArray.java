package com.array;

public class FindElementInArray {
	public static void main(String[] args) {
		//write a program to fine out weather a given integer is present in an array or not
		float[] marks= {23.4f,56.6f,34.5f,67.9f,65.4f,65.8f};
		float num=56.6f;
		boolean isInArray=false;
		for(float element:marks) {
			if(num==element) {
				isInArray=true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The value is present in the array");
		}
		else {
			System.out.println("The value is not present in the array");
		}
	}

}
