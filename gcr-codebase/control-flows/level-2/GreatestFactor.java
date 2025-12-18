import java.util.Scanner;

public class GreatestFactor {
  public static void main(String[] args) {

     //creating object of scanner class
        Scanner input = new Scanner(System.in);

       // taking input from user
	     System.out.println("Enter number");
          int number = input.nextInt();

    // creating logic
    int greatestFactor = 1;
    for (int i = number - 1; i >= 1; i--) {
      if (number % i == 0) {
        greatestFactor = i;
        break;
      }
    }

    // displaying result
    System.out.println("Greatest factor is " + greatestFactor);

       // closing scanner class stream
          input.close();
  }
}
