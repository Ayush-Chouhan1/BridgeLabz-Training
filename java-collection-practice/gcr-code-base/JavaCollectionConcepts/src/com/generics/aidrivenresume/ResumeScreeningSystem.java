package com.generics.aidrivenresume;


import java.util.*;

public class ResumeScreeningSystem {

	public static void main(String[] args) {

		Resume<SoftwareEngineer> r1 = new Resume<>("Ayush", new SoftwareEngineer());

		Resume<DataScientist> r2 = new Resume<>("Neha", new DataScientist());

		Resume<ProductManager> r3 = new Resume<>("Ram", new ProductManager());

		r1.displayResume();
		r2.displayResume();
		r3.displayResume();

		List<JobRole> roles = new ArrayList<>();
		roles.add(new SoftwareEngineer());
		roles.add(new DataScientist());
		roles.add(new ProductManager());

		System.out.println("\n---- Screening Pipeline ----");
		ScreeningUtil.screenResumes(roles);
	}
}