package com.methodreferences.nameuppercasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HRLetter {

	public static void main(String[] args) {

		List<String> employeeNames = Arrays.asList("Ayush", "Rahul", "Neha", "Priya");

		List<String> upperCaseNames = employeeNames.stream().map(String::toUpperCase).collect(Collectors.toList());

		upperCaseNames.forEach(System.out::println);
	}
}
