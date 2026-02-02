package com.interfaces.functionalinterfaces.stringlength;

import java.util.function.*;

public class StringLength {

	public static void main(String[] args) {

		int limit = 35;
		String str = "Ayush Chouhan";

		Function<String, Integer> stringLength = (x) -> x.length();
		
		int length = stringLength.apply(str);
		
		if (length > limit) {
			System.out.println( "String length exceeded.");
		} else {
			System.out.println( "String length under limit");
		}
	
		
		

	}
}
