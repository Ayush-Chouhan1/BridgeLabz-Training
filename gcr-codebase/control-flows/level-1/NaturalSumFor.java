import java.util.Scanner;

public class NaturalSumFor {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int n = input.nextInt();

    // creating logic
    if (n >= 0) {
      int sumFormula = n * (n + 1) / 2;
      int sumLoop = 0;
      for (int i = 1; i <= n; i++) {
        sumLoop = sumLoop + i;
      }
	  
	  // displaying results
      System.out.println("Sum using formula is " + sumFormula);
      System.out.println("Sum using for loop is " + sumLoop);
    } else {
      System.out.println("The number " + n + " is not a natural number");
    }



    //closing scanner class stream
        input.close();
  }
}
