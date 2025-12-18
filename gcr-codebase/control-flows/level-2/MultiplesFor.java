import java.util.Scanner;

public class MultiplesFor {
  public static void main(String[] args) {

       // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	   System.out.println("Enter number under 100");
       int number = input.nextInt();

          // creating logic
    if (number > 0 && number < 100) {
      for (int i = 100; i >= 1; i--) {
        if (i % number == 0)
          System.out.println(i);
      }
    }


    // closing scanner class stream
    input.close();
  }
}
