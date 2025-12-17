import java.util.Scanner;

public class SideOfSqaure{
  public static void main(String[] args){
     

      //Constructing Scanner object
       Scanner sc = new Scanner(System.in);
      

       // taking input from user
         System.out.println("Enter parameter of Square");
         int parameter = sc.nextInt();
       

      // calculating sides of square 
         int side = parameter/4;
        

      // Displaying results 
         System.out.println("The length of the side is "+ side +" whose perimeter is " + parameter);
         }
   }




  