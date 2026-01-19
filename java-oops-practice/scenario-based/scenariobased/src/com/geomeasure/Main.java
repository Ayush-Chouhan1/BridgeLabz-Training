package com.geomeasure;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1:");
        Line line1 = createLine(sc);

        System.out.println("Enter coordinates for Line 2:");
        Line line2 = createLine(sc);

        LineComparator.compareLines(line1, line2);
    }

    private static Line createLine(Scanner sc) {
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        return new Line(x1, y1, x2, y2);
    }
}

