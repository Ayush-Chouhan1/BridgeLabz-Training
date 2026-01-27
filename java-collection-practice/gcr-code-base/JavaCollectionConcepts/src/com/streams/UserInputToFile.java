package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            // Read user input
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data to file
            writer = new FileWriter("user_info.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("\n Data saved successfully to user_info.txt");

        } catch (IOException e) {
            System.out.println(" Error occurred: " + e.getMessage());
        } finally {
            try {
                if (writer != null) writer.close();
                br.close();
            } catch (IOException e) {
                System.out.println(" Error while closing resources");
            }
        }
    }
}
