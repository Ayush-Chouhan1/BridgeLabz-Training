package com.geomeasure;

class Line{

    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class LineComparator {

    public static void compareLines(Line l1, Line l2) {

        double len1 = l1.calculateLength();
        double len2 = l2.calculateLength();

        System.out.println("Length of Line 1: " + len1);
        System.out.println("Length of Line 2: " + len2);

        if (len1 == len2) {
            System.out.println("Both lines are equal in length");
        } else if (len1 > len2) {
            System.out.println("Line 1 is longer");
        } else {
            System.out.println("Line 2 is longer");
        }
    }
}

