package com.generics.personalizedmealplan;

public class VeganMeal implements MealPlan {

	public String getCategory() {
		return "Vegan Meal";
	}
	
	public String getItems() {
		return "Dairy, eggs, beans";
	}
}
