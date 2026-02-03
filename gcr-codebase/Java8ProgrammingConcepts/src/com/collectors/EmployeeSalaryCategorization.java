package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

// Employee class
class Employee {
	private String name;
	private String department;
	private double salary;

	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
}

// Main class
public class EmployeeSalaryCategorization {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Ayush", "IT", 7000000), new Employee("Neha", "HR", 50000),
				new Employee("Rahul", "IT", 90000), new Employee("Priya", "Finance", 100000),
				new Employee("Amit", "HR", 60000));

		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " -> Average Salary: " + avgSalary));
	}
}
