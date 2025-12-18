import java.util.Scanner;

public class PowerUsingWhile {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

      // taking input from user
	   System.out.println("Enter number");
     int number = input.nextInt();
	  System.out.println("Enter power");
      int power = input.nextInt();

    // creating logic
    int result = 1;
    int counter = 0;
    while (counter < power) {
      result = result * number;
      counter++;
    }

    // displaying result
    System.out.println("Result is " + result);

    // closing scanner class stream
    input.close();
  }
}
