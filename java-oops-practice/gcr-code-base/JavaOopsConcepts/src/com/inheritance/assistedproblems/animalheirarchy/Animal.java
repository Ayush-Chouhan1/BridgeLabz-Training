package com.inheritance.assistedproblems.animalheirarchy;

public class Animal {
	
	String name;
	int age;
	
	
	// Constructor
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// method
	void makeSound() {
		System.out.println("Animal sound : ");
	}

}
