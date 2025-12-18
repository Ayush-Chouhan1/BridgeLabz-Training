import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {

         //Defining the scanner object to take user input
           Scanner input = new Scanner(System.in);

        //taking input from user
          System.out.println("Insert first number");
          int number1 = input.nextInt();
          System.out.println("Insert second number");
          int number2 = input.nextInt();
          System.out.println("Insert third number");
          int number3 = input.nextInt();
 
        //applying logic
          boolean firstLargest = (number1 > number2 && number1 > number3);
          boolean secondLargest = (number2 > number1 && number2 > number3);
          boolean thirdLargest = (number3 > number1 && number3 > number2);

     //displaying results
      System.out.println("Is the first number the largest? " + firstLargest);
      System.out.println("Is the second number the largest? " + secondLargest);
      System.out.println("Is the third number the largest? " + thirdLargest);
  }
}
