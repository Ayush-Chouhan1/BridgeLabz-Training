package com.inheritance.assistedproblems.animalheirarchy;

public class Cat extends Animal{

	String name;
	int age;
	
	//Constructor
	Cat(String name, int age){
		super(name, age);
	}
	
	// method
	void makeSound(){
		System.out.println(super.name + " : meow");
	}
}
