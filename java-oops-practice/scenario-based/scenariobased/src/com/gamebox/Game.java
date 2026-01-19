package com.gamebox;

abstract class Game implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    private double rating;

    // Constructor for free and paid games
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Getters 
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    // Seasonal offer using operators
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    
    public void download() {
        System.out.println(" Downloading " + title);
    }
}
