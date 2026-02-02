package com.interfaces.simpleinterfaces.digitalpaymentinterface;

public class Test {
	
		public static void main(String[] args) {
			Payable upi = new UPI();
			Payable card = new CreditCard();

			upi.pay(1000);
			upi.refund(200); // default method

			card.pay(2500);
			card.refund(500); // default method
		}
	}

