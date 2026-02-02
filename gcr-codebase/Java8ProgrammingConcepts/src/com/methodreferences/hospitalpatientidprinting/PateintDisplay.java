package com.methodreferences.hospitalpatientidprinting;

import java.util.*;

public class PateintDisplay {
	public static void main(String[] args) {
		
		// Adding patient in array list.
		ArrayList<Patient> list = new ArrayList<>();
		list.add(new Patient("Amar", 67, 8037432));
		list.add(new Patient("Shamu", 57, 856742342));
		list.add(new Patient("Nikita", 32, 834532));
		list.add(new Patient("Ankur", 45, 987523432));
		list.add(new Patient("Mohit", 25, 82136532));
		
		// Printing patient details using method reference
	    list.forEach(System.out::println);
	}
	
	 

}
