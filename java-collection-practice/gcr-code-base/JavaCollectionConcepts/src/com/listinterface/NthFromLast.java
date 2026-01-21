package com.listinterface;

import java.util.*;

public class NthFromLast {

	public static char findElement(LinkedList<Character> list, int k) {

		int slow = 0;
		int fast = k;

		

			while (fast < list.size()) {
				slow++;
				fast++;
			}

		

		return list.get(slow);
	}

	public static void main(String[] args) {

		LinkedList<Character> list = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		int k =2;
		
		System.out.println(findElement(list, k));
		

	}

}
