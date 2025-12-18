import java.util.Scanner;

public class NaturalSumWhile {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter the number");
    int n = input.nextInt();

    // creating logic
    if (n >= 0) {
      int sumFormula = n * (n + 1) / 2;
      int sumLoop = 0;
      int i = 1;
      while (i <= n) {
        sumLoop = sumLoop + i;
        i++;
      }
      System.out.println("Sum using formula is " + sumFormula);
      System.out.println("Sum using while loop is " + sumLoop);
	  System.out.println("Diffrence between both is " + (sumLoop-sumFormula));

    } else {
      System.out.println("The number " + n + " is not a natural number");
    }

    // closing scanner class stream
    input.close();
  }
}
