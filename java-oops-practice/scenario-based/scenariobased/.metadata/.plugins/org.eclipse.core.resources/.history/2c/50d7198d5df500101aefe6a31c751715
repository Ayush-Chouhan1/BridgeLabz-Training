package com.bagballorganiser;

import java.util.ArrayList;
import java.util.List;

class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("❌ Bag is full! Cannot add ball " + ball.getId());
            return;
        }
        balls.add(ball);
        System.out.println("✅ Ball added to bag " + id);
    }

    public void removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equals(ballId)) {
                balls.remove(b);
                System.out.println("🗑 Ball removed from bag " + id);
                return;
            }
        }
        System.out.println("❌ Ball not found in bag");
    }

    public void displayBalls() {
        System.out.println("Balls in Bag " + id + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls inside");
            return;
        }
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    
    public void displayInfo() {
        System.out.println("Bag ID: " + id + ", Color: " + color +", Capacity: " + capacity +", Current Balls: " + balls.size());
    }
}

