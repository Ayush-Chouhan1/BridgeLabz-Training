package com.methodreferences.hospitalpatientidprinting;

public class Patient {
	
	//Patients details
	String name;
	int age;
	long patientID;
		
	//Patient constructor
	public Patient(String name, int age, long pateintID) {
		this.name = name;
		this.age = age;
		this.patientID = pateintID;
	}
	
	@Override
	// Overriding to string method
	public String toString() {
		return "Name - "+ name +" Age - " + age + " Pateint ID - "+ patientID;
	}
	

}
