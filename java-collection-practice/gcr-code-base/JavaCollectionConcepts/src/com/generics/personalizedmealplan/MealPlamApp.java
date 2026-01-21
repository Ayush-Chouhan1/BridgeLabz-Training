package com.generics.personalizedmealplan;

public class MealPlamApp {

	public static void main(String[] args) {
		
		Meal<VegetarianMeal> m1 = MealGenerator.generateMeal(new VegetarianMeal());

		Meal<VeganMeal> m2 = MealGenerator.generateMeal(new VeganMeal());

		

		m1.showMeal();
		m2.showMeal();
		

	}
}
