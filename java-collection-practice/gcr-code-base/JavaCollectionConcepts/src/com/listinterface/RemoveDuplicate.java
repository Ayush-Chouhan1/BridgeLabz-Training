package com.listinterface;
import java.util.*;

public class RemoveDuplicate {
	
	public static List<Integer> removeDuplicate(List<Integer> list){
		
		Set<Integer> set = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		
		for(Integer item : list) {
			if(set.add(item)) {
				result.add(item);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
		
		
		System.out.println(removeDuplicate(list));
		
		
	}

}
