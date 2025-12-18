import java.util.Scanner;

public class NaturalNumberSum {
  public static void main(String[] args) {


        //Defining the scanner object to take user input
          Scanner input = new Scanner(System.in);

       //taking input from user
         System.out.println("Enter the number ");
         int number = input.nextInt();
    
       //applying logic
         if (number >= 0) {
         int sum = number * (number + 1) / 2;
         System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
         System.out.println("The number " + number + " is not a natural number");
      }
  }
}
