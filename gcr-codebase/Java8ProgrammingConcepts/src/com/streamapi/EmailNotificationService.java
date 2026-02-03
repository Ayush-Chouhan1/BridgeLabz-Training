package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationService {

	public static void main(String[] args) {

		List<String> emails = Arrays.asList("user1@gmail.com", "user2@gmail.com", "user3@gmail.com");

		// Send notification to each email
		emails.forEach(email -> sendEmailNotification(email));
	}

	// Simulated email sending method
	private static void sendEmailNotification(String email) {
		System.out.println("Notification email sent to: " + email);
	}
}
