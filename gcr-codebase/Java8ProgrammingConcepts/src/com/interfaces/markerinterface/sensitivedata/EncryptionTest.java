package com.interfaces.markerinterface.sensitivedata;

public class EncryptionTest {
	public static void main(String[] args) {
		UserCredentials creds = new UserCredentials("Ayush", "password123");

		UserProfile profile = new UserProfile("Ayush", "ayushuj@gmail.com");

		EncryptionService.encrypt(creds);
		EncryptionService.encrypt(profile);
	}
}