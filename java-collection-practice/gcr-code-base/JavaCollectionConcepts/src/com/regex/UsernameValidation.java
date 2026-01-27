package com.regex;
public class UsernameValidation {
    public static void main(String[] args) {

        String[] usernames = {"Ayush01", "12Ayush", "thisisayush"};

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + "  - Valid");
            } else {
                System.out.println(username + "   - Invalid");
            }
        }
    }
}