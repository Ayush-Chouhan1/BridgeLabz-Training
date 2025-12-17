import java.util.Scanner;

public class DistanceInYards{
     public static void main(String [] args){
       
        //Constructing Scanner object
          Scanner sc = new Scanner(System.in);
       

        // taking input from user`
           System.out.println("Enter Distance in feet");
           double distance = sc.nextDouble();

         // calculating distance in yards
           double yards = distance / 3;
           
        // calculating distance in mile
           double mile = yards / 1760;
         
        
      
         // Displaying results 
           System.out.println("The distance in yards is "+ yards + " while the distance in miles is " +mile);


          }
   }


      

