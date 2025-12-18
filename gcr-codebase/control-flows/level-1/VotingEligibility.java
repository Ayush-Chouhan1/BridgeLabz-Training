import java.util.Scanner;

public class VotingEligibility {
  public static void main(String[] args) {


        //Defining the scanner object to take user input
          Scanner input = new Scanner(System.in);
 
       //taking input from user
         System.out.println("Enter person's age");
         int age = input.nextInt();
    //applying logics
    if (age >= 18) {
      System.out.println("The person's age is " + age + " and can vote.");
    } else {
      System.out.println("The person's age is " + age + " and cannot vote.");
    }
  }
}
