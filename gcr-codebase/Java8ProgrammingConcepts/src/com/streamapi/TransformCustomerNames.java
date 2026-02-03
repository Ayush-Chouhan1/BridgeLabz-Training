package com.streamapi;
import java.util.Arrays;
import java.util.List;

public class TransformCustomerNames {

    public static void main(String[] args) {

        List<String> customerNames =
                Arrays.asList("ayush", "neha", "rahul", "priya", "amit");

        customerNames.stream()
                     // convert to uppercase
                     .map(String::toUpperCase)

                     //  sort alphabetically
                     .sorted()

                     //  display
                     .forEach(System.out::println);
    }
}
