import java.util.Scanner;

public class FirstSmallest {
  public static void main(String[] args) {

        // Defining the scanner object to take user input
           Scanner input = new Scanner(System.in);

        //taking input from user
          int number1 = input.nextInt();
          int number2 = input.nextInt();
          int number3 = input.nextInt();

        //applying logic
          boolean result = (number1 < number2 && number1 < number3);
      
        // displaying result
          System.out.println("Is the first number the smallest? " + result);
  }
}
