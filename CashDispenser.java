package com.loop;

import java.util.Scanner;

/*
a. Enter the amount, and we should get message please collect cash
b. Then prompt a message do you want to continue(yes or no)
c. If yes, then again enter the amount and we should get message 
   please collect cash
d. If you enter no, then program should stop

 */
public class CashDispenser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cdn="yes";
		while(cdn.equals("yes")) {
			System.out.println("Enter the amount.");
			int amount=sc.nextInt();
			System.out.println("Plese collect cash."+amount);
			System.out.println("Do you want to contine(yes/no)");
			cdn = sc.next(); //alter the value of cdn
			
			if(!cdn.equals("yes")) {
				System.out.println("Thank You... Visit Again");
			}
		}
	}
}
