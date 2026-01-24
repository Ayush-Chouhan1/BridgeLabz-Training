package com.mapinterface;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class InvertMapExample {

    public static void main(String[] args) {

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = new HashMap<>();

        // Invert logic
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            invertedMap
                .computeIfAbsent(value, v -> new ArrayList<>())
                .add(key);
        }

        // Output
        System.out.println("Original Map: " + originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }
}
