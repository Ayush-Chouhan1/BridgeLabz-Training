package com.interfaces.defaultmethodsinterfaces.paymentgateway;

public class UPIProcessor implements PaymentProcessor {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}