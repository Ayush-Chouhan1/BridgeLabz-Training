import java.util.Scanner;

public class RocketCountdownFor {
  public static void main(String[] args) {

 
     //Creating Scanner class object 
       Scanner input = new Scanner(System.in);

     //taking input from user
       System.out.println("Enter countdown Starting number");
       int counter = input.nextInt();


       //Displaying result
        for (int i = counter; i >= 1; i--) {
        System.out.println(i);
    }

  
      // closing scanner class stream
         input.close();
  }
}
