package com.listinterface;

import java.util.*;

public class ReverseList {

	public static List<Integer> reverseList(List<Integer> list) {

		int i =0, j = list.size()-1;
		while(i<j) {
			int temp = list.get(i);
			list.set(i, list.get(j));		
			list.set(j, temp);
			i++;
			j--;
			}
		return list;
		
	}

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>();

		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		
		reverseList(arraylist);
		System.out.println(arraylist);
		
		List<Integer> linkedlist = new LinkedList<Integer>();
		
		linkedlist.add(6);
		linkedlist.add(7);
		linkedlist.add(8);
		linkedlist.add(9);
		linkedlist.add(10);
		
		reverseList(linkedlist);
		System.out.println(linkedlist);


	}

}
