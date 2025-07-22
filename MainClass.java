package com.tcs.auth;

import com.tcs.service.EmailService;

public class MainClass {
	public static void main(String[] args) {
		EmailService es = new EmailService();
		es.sendEmail();
	}

}
