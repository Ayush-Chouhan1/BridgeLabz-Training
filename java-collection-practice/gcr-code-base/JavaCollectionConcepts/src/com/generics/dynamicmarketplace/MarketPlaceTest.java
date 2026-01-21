package com.generics.dynamicmarketplace;

import java.util.*;

public class MarketPlaceTest {
	
	public static void main(String[] args) {
		
		 Product<BookCategory> book = new Product<>("Java Complete Reference", 800, new BookCategory());

	     Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1200, new ClothingCategory());

	     Product<GadgetCategory> phone = new Product<>("Smartphone", 30000, new GadgetCategory());
	     
	     List<Product<? extends Category>> catalog = new ArrayList<>();
	        catalog.add(book);
	        catalog.add(shirt);
	        catalog.add(phone);

	        System.out.println(" before discount  ");
	        for (Product<? extends Category> p : catalog) {
	            System.out.println(p);
	        }

	        DiscountUtil.applyDiscount(book, 10);
	        DiscountUtil.applyDiscount(shirt, 20);
	        DiscountUtil.applyDiscount(phone, 5);

	        System.out.println("\n  after discount    ");
	        for (Product<? extends Category> p : catalog) {
	            System.out.println(p);
	        }
	    
	}

}
