package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
	private String customer;
	private double total;

	public Order(String customer, double total) {
		this.customer = customer;
		this.total = total;
	}

	public String getCustomer() {
		return customer;
	}

	public double getTotal() {
		return total;
	}
}

public class OrderRevenueSummary {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order("Ayush", 2500.0), new Order("Neha", 1800.0),
				new Order("Ayush", 3200.0), new Order("Rahul", 1500.0), new Order("Neha", 2200.0));

		// Sum order totals per customer
		Map<String, Double> revenueByCustomer = orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));

		// Print result
		revenueByCustomer.forEach((customer, sum) -> System.out.println(customer + " -> Total Revenue: ₹" + sum));
	}
}
