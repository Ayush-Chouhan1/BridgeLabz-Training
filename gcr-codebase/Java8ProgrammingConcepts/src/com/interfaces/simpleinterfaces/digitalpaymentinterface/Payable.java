package com.interfaces.simpleinterfaces.digitalpaymentinterface;

public interface Payable {
	void pay(double amount);
	
	default void refund(double amount) {
		System.out.println("Refund of ₹" + amount + " processed");
	}

}
