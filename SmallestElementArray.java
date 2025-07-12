package com.array;

public class SmallestElementArray {
	public static void main(String[] args) {
		int[] arr= {12,34,56,67,45,34,54};
		int min = arr[0];
		for(int num:arr) {
			if(num<min)
				min=num;
		}
		System.out.println("Smallest element: "+min);
	}

}
