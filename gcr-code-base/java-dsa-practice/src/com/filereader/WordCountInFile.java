package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

    public static void main(String[] args) {

        String fileName = "input.txt";
        String targetWord = "java";
        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Occurrences of '" + targetWord + "': " + count);
    }
}
