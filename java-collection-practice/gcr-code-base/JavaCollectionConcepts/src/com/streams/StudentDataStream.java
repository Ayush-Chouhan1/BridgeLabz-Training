package com.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDataStream {

	private static final String FILE_NAME = "student.dat";

	public static void main(String[] args) {

		// Write primitive data
		writeStudentData();

		// Read primitive data
		readStudentData();
	}

	// Write student data to binary file
	private static void writeStudentData() {

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {

			int rollNo = 57;
			String name = "Ayush";
			double gpa = 8.75;

			dos.writeInt(rollNo);
			dos.writeUTF(name);
			dos.writeDouble(gpa);

			System.out.println(" Student data written successfully.");

		} catch (IOException e) {
			System.out.println(" Write Error: " + e.getMessage());
		}
	}

	// Read student data from binary file
	private static void readStudentData() {

		try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {

			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			System.out.println("\n Retrieved Student Data:");
			System.out.println("Roll No: " + rollNo);
			System.out.println("Name   : " + name);
			System.out.println("GPA    : " + gpa);

		} catch (IOException e) {
			System.out.println(" Read Error: " + e.getMessage());
		}
	}
}
