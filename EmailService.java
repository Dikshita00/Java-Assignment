package com.overloadingprogram;

import java.util.Scanner;

/*
 * Overloading(compile time polymorphism)
 * -Here we develop more than one method with same name in same class 
 *  provided they have different number of arguments or different type of argument.
 */
public class EmailService {
	
	public void sendEmail(String To, String subject, String message) {
		System.out.println("Email Sending...");
	}
	public void sendEmail(String To, String subject, String message, String filepath) {
		System.out.println("Email Sending With Attachment...");
	}
	
	public static void main(String[] args) {
		EmailService serivce =new EmailService();
		serivce.sendEmail("dikshussingh@gmail.com","Result" ,"Congratulations You Have cleared The Test", "G:\\image.png");
		
	}

}
