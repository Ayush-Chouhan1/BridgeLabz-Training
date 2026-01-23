package com.sorting.movietime;

class Show {
    String movieName;
    int showTime; // time in 24-hour format ( 1430 = 2:30 PM)

    // Constructor
    Show(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }
}
