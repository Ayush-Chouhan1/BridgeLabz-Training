package com.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {

		String paragraph = "java is powerful and java is fast and java is popular";

		Map<String, Integer> wordFrequency = Arrays.stream(paragraph.split("\\s+"))
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

		wordFrequency.forEach((word, count) -> System.out.println(word + " -> " + count));
	}
}
