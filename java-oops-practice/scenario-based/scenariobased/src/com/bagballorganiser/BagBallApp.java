package com.bagballorganiser;

import java.util.ArrayList;
import java.util.List;

public class BagBallApp {

    public static void main(String[] args) {

        Bag redBag = new Bag("B1", "Red", 2);
        Bag blueBag = new Bag("B2", "Blue", 3);

        Ball ball1 = new Ball("Ball 1", "Yellow", "Small");
        Ball ball2 = new Ball("Ball 2", "Green", "Medium");
        Ball ball3 = new Ball("Ball 3", "Blue", "Large");

        redBag.addBall(ball1);
        redBag.addBall(ball2);
        redBag.addBall(ball3); 

        redBag.displayBalls();

        
        redBag.removeBall("BALL1");
        redBag.displayBalls();

        List<Bag> bags = new ArrayList<>();
        bags.add(redBag);
        bags.add(blueBag);

        for (Bag b : bags) {
            b.displayInfo();
        }
    }
}
