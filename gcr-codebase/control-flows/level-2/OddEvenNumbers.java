import java.util.Scanner;

public class OddEvenNumbers {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
    if (number >= 1) {
      for (int i = 1; i <= number; i++) {
        if (i % 2 == 0) {
          System.out.println(i + " is even");
        } else {
          System.out.println(i + " is odd");
        }
      }
    } else {
      System.out.println("enter natural number");
    }

    //closing scanner class
    input.close();
  }
}
