package com.loop;

import java.util.Scanner;

/*
  	a. User will enter the pin number 1234
	b. If the entered pin number is valid , then program should print
	   welcome and stop
	c. If pin number is invalid, user can attempt to enter pin 
	   maximum 3 times.
	d. If All 3 times pin number is invalid then card blocked message
	   we should get
	   
for loop is use when we know the iteration of the loop

 */
public class Authenticator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {  //1-3
			System.out.println("Enter pin number.");
			int pin=sc.nextInt();
			if(pin==1234) {
				System.out.println("Welcome");
				break;
			}
			else {
				System.out.println("Invalid pin number");
				if(i==3) {
					System.out.println("Card is blocked!!");
				}
			}
		}
		
	}

}
