package com.interfaces.markerinterface.cloneing;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Original prototype object
		Document original = new Document("Insurance Policy", "Standard Terms and Conditions");

		// Clone the prototype
		Document cloned = (Document) original.clone();

		// Modify clone
		cloned.title = "Insurance Policy - Copy";

		System.out.println("Original: " + original);
		System.out.println("Cloned:   " + cloned);
	}
}
