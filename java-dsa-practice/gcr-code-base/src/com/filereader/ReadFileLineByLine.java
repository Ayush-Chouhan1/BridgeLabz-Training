package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fileReader);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); 
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
