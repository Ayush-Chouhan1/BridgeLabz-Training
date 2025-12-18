import java.util.Scanner;

public class AgeHeight {
  public static void main(String[] args) {

    //creating object of scanner class
       Scanner input = new Scanner(System.in);

           // taking input from user
	       System.out.println("Enter age");
            int amarAge = input.nextInt();
	     	System.out.println("Enter age");
          int akbarAge = input.nextInt();
		    System.out.println("Enter age"); 
            int anthonyAge = input.nextInt();
		   System.out.println("Enter height");
            double amarHeight = input.nextDouble();
			System.out.println("Enter height");
            double akbarHeight = input.nextDouble();
			System.out.println("Enter height");
            double anthonyHeight = input.nextDouble();

    // creating logic
    int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
    double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

    // displaying result
    System.out.println("Youngest age is " + youngestAge);
    System.out.println("Tallest height is " + tallestHeight);

    // closing scanner class stream
        input.close();
  }
}
