import java.util.Scanner;

public class SumUntilZeroOrNegative {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);


    // taking input from user
      System.out.println("Enter number");

    double total = 0.0;


    // creating logic
    while (true) {
      double number = input.nextDouble();
      if (number <= 0) {
        break;}
      total = total + number;
    }

      //displaying result
         System.out.println("The total sum is " + total);



      //closing scanner class stream
        input.close();
  }
}
