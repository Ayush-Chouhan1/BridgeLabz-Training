package com.generics.personalizedmealplan;

public class VegetarianMeal implements MealPlan{

	public String getCategory() {
		 return "Vegetarian meal";
	}
	
	public String getItems() {
		return "Dal, Salad, roti";
	}
}
