package com.arraysinjava;
/*
  Array Sorting
  Compare x[i] > x[i+1], if true swap the element
  End of first round of comparison heavy element will go to the bottom of the array
  Compare x[i] >x[i+1], array length-1 maximum
 */
public class ArraySortingEx {
	public static void main(String[] args) {
		int[] x= {23,45,56,45,23};
		int temp;
		for(int j=0;j<x.length-1;j++) {//j=0,1,2,3
			for(int i=0;i<x.length-1;i++) {//0 to 3
				if(x[i]>x[i+1]) {
				temp=x[i+1];
				x[i+1]=x[i];
				x[i]=temp;
			}
		}
		}

	for(int arr:x) {
		System.out.println(arr);
		}
	}
}
