package com.mapinterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "input.txt";  // path to text file
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                // Split into words
                String[] words = line.split("\\s+");

                // Count word frequency
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display result
        System.out.println(wordCount);
    }
}
