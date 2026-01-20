package com.dynamicmarketplace;

interface Category{
	String getCategoryName();
}

class BookCategory implements Category{
	public String getCategoryName() {
		return "Books";
	}
}

class ClothingCategory implements Category{
	public String getCategoryName() {
		return "Cloths";
	}
}

class GadgetCategory implements Category{
	public String getCategoryName() {
		return "gadegts";
	}
}

public class Product<T extends Category> {
	
	private String name;
	private double price;
	private T category;
	
	Product(String name, double price, T category){
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	  public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public T getCategory() {
	        return category;
	    }

	    public String toString() {
	        return "Product name= " + name + " price=" + price +", category=" + category.getCategoryName() ;
	    }

}

class DiscountUtil{
	
	 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

	        double oldPrice = product.getPrice();
	        double discount = oldPrice * (percentage / 100);
	        product.setPrice(oldPrice - discount);
	    }
}
