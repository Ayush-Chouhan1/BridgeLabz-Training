import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

      //creating logic
        for (int i = 6; i <= 9; i++) {
        System.out.println(number + " * " + i + " = " + (number * i));
    }


    // closing scanner class stream
    input.close();
  }
}
