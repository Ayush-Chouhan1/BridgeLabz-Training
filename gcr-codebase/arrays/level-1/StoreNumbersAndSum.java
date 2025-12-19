import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {

        //Create Scanner object
          Scanner input = new Scanner(System.in);

        //Declare array 
         double[] numbers = new double[10];
		 
         double total = 0.0;
         int index = 0;

        // Infinite loop 
        while (true) {

            if (index == numbers.length) {
                break;
            }

            // Take number input from user
            System.out.print("Enter a number: ");
            double value = input.nextDouble();

            //Break if user enters 0 
            if (value <= 0) {
                break;
            }
            //Store value in array
            numbers[index] = value;
            index++;
        }

        //Calculate sum of entered numbers
        for (int i=0; i< index; i++) {
            total += numbers[i];
        }

        //Display all numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display sum of numbers
        System.out.println("Total sum = " + total);

        // Close Scanner
        input.close();
    }
}
