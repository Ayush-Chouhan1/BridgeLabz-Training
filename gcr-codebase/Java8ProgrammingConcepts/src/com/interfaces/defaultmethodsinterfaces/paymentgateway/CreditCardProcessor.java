package com.interfaces.defaultmethodsinterfaces.paymentgateway;

public class CreditCardProcessor implements PaymentProcessor {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card");
	}
}