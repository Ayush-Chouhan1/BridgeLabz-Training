package com.listinterface;

import java.util.*;

public class FrequencyElement {

	public static Map<String, Integer> countFrequency(List<String> list) {

		Map<String, Integer> maps = new HashMap<>();

		for (String str : list) {
			maps.put(str, maps.getOrDefault(str, 0) + 1);
		}
		return maps;
	}

	public static void main(String[] args) {


		List<String> nameList = Arrays.asList("apple", "banana", "apple", "orange");

		Map<String, Integer> result = countFrequency(nameList);
		System.out.println(result);

	}
	

}
