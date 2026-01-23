package com.sorting.flashdealz;

import java.util.Arrays;

public class User {
	public static void main(String[] args) {
		
		// Creating product 
		Product p1 = new Product("Fridge", 45000, 15);
		Product p2 = new Product("Fan", 2500, 10);
		Product p3 = new Product("Football", 1500, 25);
		Product p4 = new Product("Smart Phone", 95000, 33);
		Product p5 = new Product("AC", 45000, 15);
		Product p6 = new Product("Bottle", 450, 45);
		Product p7 = new Product("Desk", 35000, 45);
		Product p8 = new Product("Laptop", 99000, 25);
		
		// Inserting products in arrray
		Product[] product = {p1, p2, p3,p4, p5, p6, p7 , p8};
		
		// Quick sort
		FlashDealz.quickSort(product, 0, product.length-1);
		
		// Displaying result
		System.out.println(Arrays.toString(product));
		
		}

	}


