import java.util.Scanner;

public class AreaOfTriangle{
   public static void main(String[] args){
       

     //Constructing Scanner object
      Scanner sc = new Scanner(System.in);
  

     // taking input from user
       System.out.println("Enter base of triangle");
       double base = sc.nextDouble();
       System.out.println("Enter height of triangle");
       double height = sc.nextDouble();

    
        // calculating area of triangle in centiMeter
           double areaInCm = 10.5 * (base) * (height);

        // Changing unit of length
           base =(double) base/2.54;      
           height = (double) height / 2.54;
          
        // calculating area of triangle in Inches
           double areaInInches = 0.5 * (base) * (height);


       // Displaying results 
          System.out.println("The Area of the triangle in sq inches is "+ areaInInches + " and in sq centiMeter is " + areaInCm );
          }
     }
 



