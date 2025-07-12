package com.array;
//Find the largest element in an array
public class LargestElement {
	public static void main(String[] args) {
		int[] arr= {12,34,56,78,45,34,24};
		int max=arr[0];
		for(int num:arr) {
			if(num>max)
				max=num;
		}
		System.out.println("Largest element: "+max);
	}

}
