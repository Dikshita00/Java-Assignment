package com.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
         int[] arr= {1,2,3,4,5,6,7,8,9};
         int n=arr.length;
         for(int i=0;i<n/2;i++) {
        	 int temp=arr[i];
        	 arr[i]=arr[n-i-1];
        	 arr[n-i-1]=temp;
         }
         System.out.println("Reversed array :"+ Arrays.toString(arr ));
    }
}
