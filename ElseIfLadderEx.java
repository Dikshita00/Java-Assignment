package com.loop;

import java.util.Scanner;

/*
    #else if ladder statement-
    If the user enter yes, it should print pass
 	If the user enters no, it should print fail
 	If the user enter something else, it should print invalid input
 */
public class ElseIfLadderEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input(yes/no)");
		String value = sc.next();
		
		if(value.equals("yes")) {
			System.out.println("pass");
		}else if(value.equals("no")) {
			System.out.println("fail");
		}
		else {
			System.out.println("Invalid Input...");
		}
		
	}
	

}
