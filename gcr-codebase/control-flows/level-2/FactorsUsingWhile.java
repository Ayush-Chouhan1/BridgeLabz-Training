import java.util.Scanner;

public class FactorsUsingWhile {
  public static void main(String[] args) {

         //creating object of scanner class
         Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

     // creating logic
        int i = 1;
        if (number > 0) {
        while (i < number) {
        if (number % i == 0)
          System.out.println(i);
        i++;
      }
    }

    // closing scanner class stream
    input.close();
  }
}
