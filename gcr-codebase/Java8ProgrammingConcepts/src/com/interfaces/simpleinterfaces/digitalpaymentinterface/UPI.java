package com.interfaces.simpleinterfaces.digitalpaymentinterface;

public class UPI implements Payable{

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}
