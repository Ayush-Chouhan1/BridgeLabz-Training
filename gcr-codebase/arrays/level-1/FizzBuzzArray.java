import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        //create Scanner object
        Scanner input = new Scanner(System.in);

        //take input number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        //validate input
        if (number <= 0) {
            System.out.println("Invalid input");
            input.close();
            return;
        }

        //creating String array
        String[] results = new String[number + 1];

        //generate FizzBuzz and store in array
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        //display results 
        for (int i = 1; i <= number; i++) {
            System.out.println("index " + i + " = " + results[i]);
        }

        // Close Scanner object
        input.close();
    }
}
