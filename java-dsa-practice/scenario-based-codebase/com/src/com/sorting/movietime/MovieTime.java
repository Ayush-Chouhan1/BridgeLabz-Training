package com.sorting.movietime;

public class MovieTime {

    public static void insertionSort(Show[] shows) {

        int n = shows.length;

        for (int i = 1; i < n; i++) {

            Show key = shows[i];   
            int j = i - 1;

            while (j >= 0 && shows[j].showTime > key.showTime) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }

    // Display show listings
    public static void displayShows(Show[] shows) {
        for (Show s : shows) {
            System.out.println(s.movieName + " | Time: " + formatTime(s.showTime));
        }
    }

    // Utility method to format time
    private static String formatTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return String.format("%02d:%02d", hours, minutes);
    }

    // Driver method
    public static void main(String[] args) {

        Show[] shows = {
            new Show("Avengers", 1030),
            new Show("Inception", 1200),
            new Show("Interstellar", 1400),
            new Show("Joker", 1330),    
            new Show("Batman", 1600)
        };

        // Sort shows by time
        insertionSort(shows);

        // Display final sorted list
        displayShows(shows);
    }
}
