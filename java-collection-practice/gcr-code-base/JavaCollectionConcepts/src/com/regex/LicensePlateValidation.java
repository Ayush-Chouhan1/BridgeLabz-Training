package com.regex;

public class LicensePlateValidation {
	
	public static void main(String[] args) {
		
		String[] plate = {"MP04UD5544","MP09UD0010","MPUD5544","MP04XN5644" };
		
		String regex = "^[A-Z ]{2}[0-9 ]{2}[A-Z ]{2}[0-9 ]{4}";
		
		for(String plates : plate ) {
			if(plates.matches(regex)) {
				System.out.println(plates + " Valid plate number.");
			}
			else {
				System.out.println(plates + " In-Valid plate number.");

			}
		}
	}

}
