package com.setinterface;

import java.util.Set;

import java.util.HashSet;

public class TwoSetEqual {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		s1.add(1);
		s1.add(2);
		s1.add(3);

		s2.add(3);
		s2.add(2);
		s2.add(1);

		boolean result = s1.equals(s2);
		System.out.println(result);

	}

}
