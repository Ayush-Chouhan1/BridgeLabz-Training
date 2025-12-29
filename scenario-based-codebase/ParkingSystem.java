import java.util.Scanner;


public class ParkingSystem{
    public static void main(String[] args) {

      // creating scanner class object
      Scanner sc = new Scanner(System.in);

      int capacity=10;
      int occupied = 0;
      int choice =0;

        while(choice !=4) {
          System.out.println("-------Parking Lot---------");
          System.out.println("Enter 1 to park");
          System.out.println("Enter 2 to exit");
          System.out.println("Enter 3 to check occupancy");
          System.out.println("Enter 4 to exit program");
           choice = sc.nextInt();


          // using switch case for user choice
          switch (choice) {
              case 1: {
                  if (occupied == 10){
                      System.out.println("Sorrt ! Parking is full");
                      choice =4;
                  }
                  else {
                      System.out.println("Gate open. You may park.");
                      occupied += 1;
                  }
                  break;
              }
              case 2: {
                  System.out.println("Exiting parking area  ");
                  occupied -= 1;
                  break;
              }
              case 3: {
                  System.out.println((capacity-occupied) + " out of " + capacity + " space left");
                  break;
              }
              case 4: {
                  System.out.println("Exiting program");
                  choice = 4;
                  break;
              }
          }

      }

        //closing scanner;
        sc.close();
    }


}