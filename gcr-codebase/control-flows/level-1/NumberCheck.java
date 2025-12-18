import java.util.Scanner;

public class NumberCheck {
  public static void main(String[] args) {


       //Defining the scanner object to take user input
         Scanner input = new Scanner(System.in);

       // taking input from user
        System.out.println("Enter Number");
        int number = input.nextInt();
   //applying logic
    if (number > 0) {
      System.out.println("positive");
    } else if (number < 0) {
      System.out.println("negative");
    } else {
      System.out.println("zero");
    }
  }
}
