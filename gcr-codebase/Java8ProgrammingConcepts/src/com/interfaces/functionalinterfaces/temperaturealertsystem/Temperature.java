package com.interfaces.functionalinterfaces.temperaturealertsystem;

import java.util.*;
import java.util.function.*;

public class Temperature {
	
	public static void main(String[] args) {
		
		int temperature = 39;
		int threshold = 37;
		
		
		Predicate<Integer> warning = (x) -> x > threshold;
		if (warning.test(temperature)) {
			System.out.println(" Alert! Temperature is too high: " + temperature);
		} else {
			System.out.println(" Temperature is normal: " + temperature);
		}
	}

}
