package com.sorting.eduresult;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(57, "Ayush", 900);
		Student s2 = new Student(7, "Amit", 99);
		Student s3 = new Student(27, "Arian", 590);
		Student s4 = new Student(54, "Ashutosh", 300);
		Student s7 = new Student(54, "Ashutosh", 300);
		Student s5 = new Student(59, "Dev", 90);
		Student s6 = new Student(90, "Sofia", 790);

		Student[] student = { s1, s2, s3, s4, s5, s6, s7 };
		EduResult.mergeSort(student, 0, student.length - 1);
		System.out.println(Arrays.toString(student));

	}

}
