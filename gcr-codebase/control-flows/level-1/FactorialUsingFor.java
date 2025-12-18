import java.util.Scanner;

public class FactorialUsingFor {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	  System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
    if (number >= 0) {
      int factorial = 1;
      for (int i = 1; i <= number; i++) {
        factorial = factorial * i;
      }
      System.out.println("The factorial of " + number + " is " + factorial);
    } else {
      System.out.println("Please enter a natural number");
    }









    // closing scanner class stream
    input.close();
  }
}
