package com.array;

public class ArraySumEx {
	public static void main(String[] args) {
		//Create array of 5 floats and calculate their sum
		float[] marks= {45.6f,67.8f,45.5f,56.7f,45.6f};
		float sum=0;
		for(float element:marks) {
			sum=sum+element;
		}
		System.out.println("The value of sum is :"+sum);
	}

}
