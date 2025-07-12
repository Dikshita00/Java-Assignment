package com.array;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr= {12,34,45,67,45,36,676};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second && num != first) {
				second=num;
			}
			System.out.println("Second largest: "+second);
		}
	}

}
