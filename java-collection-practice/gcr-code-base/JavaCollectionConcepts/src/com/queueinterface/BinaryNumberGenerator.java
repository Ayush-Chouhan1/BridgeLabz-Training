package com.queueinterface;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class BinaryNumberGenerator {

    public static List<String> generateBinary(int n) {

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {

            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;
        List<String> binaries = generateBinary(n);

        System.out.println("First " + n + " binary numbers:");
        System.out.println(binaries);
    }
}
