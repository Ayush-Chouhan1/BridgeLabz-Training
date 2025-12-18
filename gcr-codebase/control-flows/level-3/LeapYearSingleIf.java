import java.util.Scanner;

public class LeapYearSingleIf {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter year");
    int year = input.nextInt();

    // creating logic and displaying reuslt
    if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
      System.out.println("Leap Year");
    else
      System.out.println("Not a Leap Year");


    // closing scanner class stream
    input.close();
  }
}
