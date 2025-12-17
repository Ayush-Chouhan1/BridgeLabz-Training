import java.util.Scanner;

public class TotalPrice{
    public static void main(String[] args){
       

       //Constructing Scanner object
         Scanner sc = new Scanner(System.in);
 
        // taking input from user
         System.out.println("Enter Unit price ");
         int unitPrice = sc.nextInt();
         System.out.println("Enter quantity ");
         int quantity = sc.nextInt();
  
        // calculating total price
            int totalPrice = quantity * unitPrice;
    
        // Displaying results 
          System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

 
       }
  }
        

   