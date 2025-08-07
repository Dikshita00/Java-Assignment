package com.loop;

import java.util.Scanner;

public class SwitchCaseEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the floor number");
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("First Floor");
			break;
		case 2:
			System.out.println("Second Floor");
			break;
		case 3:
			System.out.println("Third Floor");
			break;
		case 4:
			System.out.println("Forth Floor");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
