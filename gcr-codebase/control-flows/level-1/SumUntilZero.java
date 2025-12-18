import java.util.Scanner;

public class SumUntilZero {
  public static void main(String[] args) {

     //Creating Scanner class object
       Scanner input = new Scanner(System.in);


     // taking input from user
      double total = 0.0;
      System.out.println("Enter number");
      double number = input.nextDouble();


     // creating while loop
      while (number != 0) {
      total = total + number;
       System.out.println("Enter number again");
      number = input.nextDouble();
         }


      // displaying result
         System.out.println("The total sum is " + total);


      // closing scanner class stream
         input.close();
  }
}
