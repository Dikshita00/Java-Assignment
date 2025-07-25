package com.abstraction;

public class NotificationServiceImpl implements NotificationService {

	@Override
	public void emailService() {
		System.out.println("Email Sending...");
	}

	@Override
	public void whatsAppService() {
		System.out.println("WhatsApp Sending...");
		
	}

	@Override
	public void smsService() {
		System.out.println("SMS Sending...");
		
	}
	public static void main(String[] args) {
		NotificationServiceImpl impl = new NotificationServiceImpl();
		impl.emailService();
		impl.whatsAppService();
		impl.smsService();
	}

}
