package com.sorting.fitnesstracker;

public class FitnessTracker {

    // Bubble Sort to rank users 
    public static void bubbleSort(User[] users) {

        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            //  loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Display leaderboard
    public static void displayLeaderboard(User[] users) {
        int rank = 1;
        for (User u : users) {
            System.out.println(
                rank++ + ". " + u.name + " | Steps: " + u.steps
            );
        }
    }

    public static void main(String[] args) {

        User[] users = {
            new User(101, "Aman", 8500),
            new User(102, "Riya", 12000),
            new User(103, "Kunal", 9600),
            new User(104, "Neha", 15000),
            new User(105, "Vikas", 11000)
        };

        // bubble Sort 
        bubbleSort(users);

        // Display ranking
        displayLeaderboard(users);
    }
}
