import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate user input
        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive number.");
            input.close();
            return;
        }

        // Declare array
           int[] multiplicationResult = new int[4];

        // Store multiplication results 
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number*(i + 6);
        }

        // Display multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number+ " * " +(i + 6)+ " = "+ multiplicationResult[i]);
        }

        // Close scanner
        input.close();
    }
}
