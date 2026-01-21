package com.listinterface;

import java.util.*;

public class RotateList {

	public static List<Integer> rotateList(List<Integer> list, int k) {

		int n = list.size();

		for (int j = 0; j < k; j++) {

			int temp = list.get(n - 1);

			for (int i = n - 1; i > 0; i--) {

				list.set(i, list.get(i-1));
			}
			list.set(0, temp);
		}
		return list;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
		int k = 5; // number of places shifted
		
		System.out.println(list);
		rotateList(list, k);
		System.out.println(list);
		

	}

}
