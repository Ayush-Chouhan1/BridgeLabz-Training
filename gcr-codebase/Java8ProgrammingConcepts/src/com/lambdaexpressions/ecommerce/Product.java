package com.lambdaexpressions.ecommerce;

public class Product {
	
	String name;
	double price;
	double rating;
	double discount;
	
	public Product(String name, double price, double rating, double discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	
	public String toString() {
		return "Name - " + name + " price - " + price + " rating "+ rating + " discount "+ discount;
	}

}
