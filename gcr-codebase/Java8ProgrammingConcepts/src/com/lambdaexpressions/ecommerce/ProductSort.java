package com.lambdaexpressions.ecommerce;

import java.util.*;

public class ProductSort {

	public static void main(String[] args) {

		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("Bag", 2500, 4.8, 5));
		list.add(new Product("Laptop", 75000, 4.5, 21));
		list.add(new Product("Laptop", 55000, 4.5, 10));
		list.add(new Product("Phone", 30000, 4.7, 15));
		list.add(new Product("Headphones", 2000, 4.2, 25));
		list.add(new Product("Smart Watch", 8000, 4.3, 20));

		Comparator<Product> byPrice = (p1, p2) -> {
			return (int) (p1.price - p2.price);
		};

		Comparator<Product> byRating = (p1, p2) -> {
			return (int) (p2.rating - p1.rating);
		};

		Comparator<Product> byDiscount = (p1, p2) -> {
			return (int) (p2.discount - p1.discount);
		};
		
		Collections.sort(list, byPrice);
		list.forEach(System.out::println);
		
		Collections.sort(list, byRating);
		list.forEach(System.out::println);
		
		Collections.sort(list, byDiscount);
		list.forEach(System.out::println);

	}

}
