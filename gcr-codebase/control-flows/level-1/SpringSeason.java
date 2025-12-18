import java.util.Scanner;

public class SpringSeason {
  public static void main(String[] args) {
  

    //creating object of scanner class
      Scanner sc = new Scanner(System.in);
    
    // taking input from user
      System.out.println("Enter month");
       int month = sc.nextInt();
      System.out.println("Enter day");
       int day = sc.nextInt();


      // applying logic
    if ((month == 3 && day >= 20) ||
        (month == 4) ||
        (month == 5) ||
        (month == 6 && day <= 20)) {
      System.out.println("Its a Spring Season");
    } else {
      System.out.println("Not a Spring Season");
    }
      // closing scanner class stream
         sc.close();
  }
}
