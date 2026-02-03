package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student {
	private String name;
	private String grade;

	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}
}

public class StudentResultGrouping {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Ayush", "A"), new Student("Neha", "B"),
				new Student("Rahul", "A"), new Student("Priya", "C"), new Student("Amit", "B"));

		// Group students by grade and collect names
		Map<String, List<String>> studentsByGrade = students.stream().collect(
				Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));

		// Print result
		studentsByGrade.forEach((grade, names) -> System.out.println(grade + " -> " + names));
	}
}
