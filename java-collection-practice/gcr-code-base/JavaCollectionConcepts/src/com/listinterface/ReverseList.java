package com.listinterface;

import java.util.*;

public class ReverseList {

	public static List<Integer> reverseList(List<Integer> list) {

		int start =0, end = list.size()-1;
		while(start<end) {
			int temp = list.get(start);
			list.set(start, list.get(end));		
			list.set(end, temp);
			start++;
			end--;
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
