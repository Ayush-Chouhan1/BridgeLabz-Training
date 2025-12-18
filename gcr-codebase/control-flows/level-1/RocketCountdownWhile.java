import java.util.Scanner;

public class RocketCountdownWhile {
  public static void main(String[] args) {
   
      //Creating Scanner class object
        Scanner input = new Scanner(System.in);

       //taking input from user
         System.out.println("Enter number");
         int counter = input.nextInt();

    while (counter >= 1) {
      System.out.println(counter);
      counter--;
    }
  }
}
