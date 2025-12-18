import java.util.Scanner;

public class LeapYearIfElse {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter year");
    int year = input.nextInt();

    // creating logic
    if (year >= 1582) {
      if (year % 400 == 0)
        System.out.println("Leap Year");
      else if (year % 100 == 0)
        System.out.println("Not a Leap Year");
      else if (year % 4 == 0)
        System.out.println("Leap Year");
      else
        System.out.println("Not a Leap Year");
    } else {
      System.out.println("Year must be 1582 or later");
    }

    // closing scanner class stream
    input.close();
  }
}
