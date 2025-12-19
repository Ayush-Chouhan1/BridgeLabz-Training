import java.util.Scanner;


class DigitFrequency {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        // validate input
        if (number < 0) {
            System.err.println("Invalid input Please enter a positive number");
           
        }
		
        // Find count of digits
        int tempNumber = number;
        int digitCount = 0;

        while (tempNumber > 0) {
            digitCount++;
            tempNumber /= 10;
        }

        // Create array to store digits
        int[] digits = new int[digitCount];
        tempNumber = number;

        // storing digits in array
        for (int i = 0; i < digits.length; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Create frequency array 
        int[] frequency = new int[10];

        // Calculate frequency 
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display digit frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        // Close Scanner
        scanner.close();
    }
}
