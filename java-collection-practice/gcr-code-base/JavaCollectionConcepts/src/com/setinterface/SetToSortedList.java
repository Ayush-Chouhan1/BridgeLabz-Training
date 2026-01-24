package com.setinterface;
import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Converting Set to List
        List<Integer> list = new ArrayList<>(set);

        // Sort list in ascending order
        Collections.sort(list);

        // Output
        System.out.println("Sorted List - " + list);
    }
}
