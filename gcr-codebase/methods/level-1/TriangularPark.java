import java.util.Scanner;

class TriangularPark {

    // Method to calculate number of rounds
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // meters
        double rounds = totalDistance / perimeter;
        return rounds;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter side 1 in meters ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2  ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3  ");
        double side3 = scanner.nextDouble();

        //Calling method
        TriangularPark run = new TriangularPark();
        double rounds = run.calculateRounds(side1, side2, side3);


        //Displaying result
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km.");
    }
}
