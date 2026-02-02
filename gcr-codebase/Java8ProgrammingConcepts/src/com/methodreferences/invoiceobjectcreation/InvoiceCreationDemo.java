package com.methodreferences.invoiceobjectcreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Invoice class
class Invoice {
	private String transactionId;

	public Invoice(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Invoice{transactionId='" + transactionId + "'}";
	}
}

// Main class
public class InvoiceCreationDemo {

	public static void main(String[] args) {

		List<String> transactionIds = Arrays.asList("TXN101", "TXN102", "TXN103");

		// constructor reference
		List<Invoice> invoices = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());

		invoices.forEach(System.out::println);
	}
}
