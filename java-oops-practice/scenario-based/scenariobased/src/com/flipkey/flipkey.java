package com.flipkey;

import java.util.*;

public class flipkey {

	public static String cleanseAndInvert(String input) {

		StringBuilder sb = new StringBuilder();

		// checking if length is less than 6
		if (input.length() < 6) {
			return "invalid input";
		}

		// convert string to lower case
		input = input.toLowerCase();
		int n = input.length();

		for (int i = 0; i < n; i++) {

			int ascii = input.charAt(i);
			
			// Eliminate special character
			if ((ascii <= 97 && ascii >= 122) && (ascii <= 65 && ascii >= 90)) {
				return "Invalid input";
			}
			
			if (ascii % 2 != 0) {
				sb.append(input.charAt(i));
			}
		}
		sb.reverse();

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
				result.append(Character.toUpperCase(sb.charAt(i)));
			} else {
				result.append(sb.charAt(i));
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Take user input
		System.out.println("Enter String input.");
		String word = sc.nextLine();

		// Display result
		System.out.println(cleanseAndInvert(word));

	}
}
