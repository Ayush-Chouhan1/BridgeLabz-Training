  import java.util.Scanner;
   
   public class QuotientAndReminder{
         public static void main(String[] args){
            

          //Constructing Scanner object
            Scanner sc = new Scanner(System.in);


          // taking input from user
             System.out.println("Enter number 1");
             int num1 = sc.nextInt();
             System.out.println("Enter number 2");
             int num2 = sc.nextInt();

           // calculating Quotient And Reminder
              int Quotient = num1 / num2;
              int Reminder = num1 % num2;



           // Displaying results 

              System.out.println("The Quotient is " + Quotient + " and Reminder is " + Reminder + " of two number " + num1 + " and " + num2); 

            }
     }

