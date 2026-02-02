package com.interfaces.defaultmethodsinterfaces.paymentgateway;

public interface PaymentProcessor {
	void pay(double amount);

	// New feature added safely
	default void refund(double amount) {
		System.out.println("Refund of ₹" + amount + " processed");
	}
}