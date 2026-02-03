package com.streamapi;

import java.util.*;
import java.util.stream.*;

class Doctor {
	String name;
	String speciality;
	boolean availability;

	public Doctor(String name, String speciality, boolean availability) {
		this.name = name;
		this.speciality = speciality;
		this.availability = availability;
	}

	public String getSpeciality() {
		return speciality;
	}

	public boolean getAvailability() {
		return availability;
	}
	
	public String toString() {
		return name + " - " + speciality;
	}
}

public class DoctorAvailbility {

	public static void main(String[] args) {
		List<Doctor> list = Arrays.asList(new Doctor("Dr. Sharma", "Cardiology", true),
				new Doctor("Dr. Mehta", "Orthopedics", false), new Doctor("Dr. Khan", "Neurology", true),
				new Doctor("Dr. Verma", "Dermatology", true), new Doctor("Dr. Singh", "Pediatrics", false));

		List<Doctor> weekdays = list.stream().filter(Doctor::getAvailability)
				.sorted(Comparator.comparing(Doctor::getSpeciality)).collect(Collectors.toList());

		weekdays.forEach(System.out::println);
	}
}
