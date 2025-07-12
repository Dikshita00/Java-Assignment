package com.array;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		int[] merge=new int[a.length + b.length];
		System.arraycopy(a,0,merge,0,a.length);
		System.arraycopy(b,0,merge,a.length,a.length);
		System.out.println("Merged array: "+ Arrays.toString(merge));

		}

}
