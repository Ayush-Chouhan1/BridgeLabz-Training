package com.lambdaexpressions.notificationfiltering;

import java.util.*;
import java.util.function.*;

class Alert {
	String type;
	String message;

	public Alert(String type, String message) {
		this.type = type;
		this.message = message;
	}

	public String toString() {
		return "Type - " + type + " Message - " + message;
	}

}

public class Notifications {

	public static void main(String[] argfs) {

		ArrayList<Alert> list = new ArrayList<>();
		list.add(new Alert("Emergency", "Heart rate critical"));
		list.add(new Alert("Medicine", "Take BP medicine at 8 AM"));
		list.add(new Alert("Appointment", "Doctor visit at 5 PM"));
		list.add(new Alert("Emergency", "Oxygen level low"));
		
		Predicate<Alert> emergencyOnly = alert -> alert.type.equals("Emergency");
		
		
		for(Alert alert : list) {
			if(emergencyOnly.test(alert)) {
				System.out.println(alert);
			}
		}


	}
}
