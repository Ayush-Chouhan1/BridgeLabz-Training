import java.util.Scanner;

public class PowerNumber {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	 System.out.println("Enter number");
    int number = input.nextInt();
	  System.out.println("Enter power of number");
    int power = input.nextInt();

    // creating logic
    int result = 1;
    for (int i = 1; i <= power; i++) {
      result = result * number;
    }

    // displaying result
    System.out.println("Result is " + result);

      // closing scanner class stream
          input.close();
  }
}
