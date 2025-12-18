import java.util.Scanner;

public class EmployesBonus {
  public static void main(String[] args) {

    //creating object of scanner classinc Cclass
      Scanner input = new Scanner(System.in);

    //taking input from user
	  System.out.println("Enter salary");
      double salary = input.nextDouble();
	  System.out.println("Enter years of service");
       int yearsOfService = input.nextInt();

       //creating logic
         if (yearsOfService > 5) {
         double bonus = salary * 0.05;
         System.out.println("The bonus amount is " + bonus);
           } else {
          System.out.println("No bonus applicable");
          }

    // closing scanner class stream
    input.close();
  }
}
