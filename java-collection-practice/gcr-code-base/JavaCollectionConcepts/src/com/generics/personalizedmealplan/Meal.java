package com.generics.personalizedmealplan;

public class Meal<T extends MealPlan > {

	T plan;
	
	Meal(T plan){
		this.plan = plan;
	}
	
	void showMeal() {
		System.out.println("Meal - "+ plan.getCategory() + " Items avilable - "+ plan.getItems());
	}
}
