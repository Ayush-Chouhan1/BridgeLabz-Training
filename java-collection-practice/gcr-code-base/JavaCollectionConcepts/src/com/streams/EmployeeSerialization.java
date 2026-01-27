package com.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	String department;
	double salary;

	// Constructor
	Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Display employee details
	public void display() {
		System.out.println(id + "  " + name + "  " + department + "  " + salary);
	}
}

public class EmployeeSerialization {

	private static final String FILE_NAME = "employees.dat";

	public static void main(String[] args) {

		// Create employee list
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Ayush", "HR", 50000));
		employees.add(new Employee(102, "Binod", "IT", 60000));
		employees.add(new Employee(103, "Camry", "Finance", 55000));

		//  Serialize employees
		serializeEmployees(employees);

		//  Deserialize employees
		deserializeEmployees();
	}

	// Serialize method
	private static void serializeEmployees(List<Employee> employees) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

			oos.writeObject(employees);
			System.out.println(" Employees saved successfully.");

		} catch (IOException e) {
			System.out.println(" Serialization Error: " + e.getMessage());
		}
	}

	// Deserialize method
	private static void deserializeEmployees() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

			List<Employee> employees = (List<Employee>) ois.readObject();

			System.out.println("\n Retrieved Employee Records:");
			for (Employee e : employees) {
				e.display();
			}

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(" Deserialization Error: " + e.getMessage());
		}
	}
}
