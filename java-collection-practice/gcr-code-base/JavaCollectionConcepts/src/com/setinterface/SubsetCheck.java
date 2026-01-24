package com.setinterface;
import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean isSubset = set2.containsAll(set1);

        // displaying result
        System.out.println(" Set1 subset of Set2  " + isSubset);
    }
}
