import java.util.Scanner;

public class DivisibleByFive {
  public static void main(String[] args) {

          // Defining the scanner object to take user input
           Scanner input = new Scanner(System.in);
      
          //taking input from user
            int number = input.nextInt();
   
          //logic for result
          boolean result = (number % 5 == 0);

         //displaying result
            System.out.println("Is the number " + number + " divisible by 5? " + result);
  }
}
