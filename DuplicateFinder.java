package com.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateFinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter array elements  ");
		String input=sc.next();
		
		String[] tokens=input.split(",");
		int[] arr=new int[tokens.length];
		for(int i=0;i<tokens.length;i++) {
			arr[i]=Integer.parseInt(tokens[i].trim());
		}
		Set<Integer> see=new HashSet<>();
		Set<Integer> duplicates=new HashSet<>();
		
		for(int num:arr) {
			if(!see.add(num)) {
				duplicates.add(num);
			}
		}
		if(duplicates.isEmpty()) {
			System.out.println("No duplicates found ");
		}else {
			System.out.println("Dplicate elements are :");
			for(int dup:duplicates) {
				System.out.println(dup);
			}
		}
		sc.close();
	}

}
