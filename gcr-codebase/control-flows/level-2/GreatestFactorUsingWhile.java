import java.util.Scanner;

public class GreatestFactorUsingWhile {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
    int greatestFactor = 1;
    int counter = number - 1;
    while (counter >= 1) {
      if (number % counter == 0) {
        greatestFactor = counter;
        break;
      }
      counter--;
    }

    // displaying result
    System.out.println("Greatest factor is " + greatestFactor);

      // closing scanner class stream
         input.close();
  }
}
