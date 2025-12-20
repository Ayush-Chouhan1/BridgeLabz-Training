import java.util.Scanner;

class HandshakeCalculator {

    // Method to calculate handshakes
    public int calculateHandshakes(int numberOfStudents) {
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        // creating scanner class object
        Scanner scanner = new Scanner(System.in);

        // Taking inout from user
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // calling method
        HandshakeCalculator calculator = new HandshakeCalculator();
        int result = calculator.calculateHandshakes(numberOfStudents);

        // Displaying number of handShakes
        System.out.println("Maximum number of handshakes: " + result);
    }
}
