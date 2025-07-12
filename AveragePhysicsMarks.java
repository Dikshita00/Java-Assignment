package com.array;

public class AveragePhysicsMarks {
	public static void main(String[] args) {
		//calculate the average marks from an array containing marks of all students in physics using for each loop
		float[] marks= {97.6f,56.7f,45.6f,94.6f,53.7f};
		float sum=0;
		for(float element:marks) {
			sum=sum+element;
		}
		System.out.println("The value of average marks is "+sum/marks.length);
	}
}
