package com.gamebox;

class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    
    public void playDemo() {
        System.out.println(" Strategy Demo: Play first 3 levels.");
    }
}
