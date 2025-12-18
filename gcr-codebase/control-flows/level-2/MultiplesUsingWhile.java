import java.util.Scanner;

public class MultiplesUsingWhile {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number below 100");
    int number = input.nextInt();

    // creating logic
    int counter = 100;
    if (number > 0 && number < 100) {
      while (counter >= 1) {
        if (counter % number == 0)
          System.out.println(counter);
        counter--;
         }
    }


    // closing scanner class stream
    input.close();
  }
}
