package com.sorting.flashdealz;

public class Product {
	
	// Take product fields
	String name;
	double price;
	double discount;
	
	//Constructor
	public Product(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	// Overriting toString method
	@Override
	public String toString() {
		return "\n Product name - "+ name +", Price - "+ price +", Discount - "+ discount;
	}
}
