package com.setinterface;

import java.util.Set;
import java.util.HashSet;

public class UnionIntersection {
	
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		
		Set<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		
		Set<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		
		System.out.println(union);
		System.out.println(intersection);


		
		
		
	}

}
