import java.util.Scanner;
   
 public class  DoubleOperation{
         public static void main(String[] args){
       

        //Constructing Scanner object
          Scanner sc = new Scanner(System.in);

        // taking input from user
           System.out.println("Enter a");
           double a = sc.nextDouble();
           System.out.println("Enter b");
           double b = sc.nextDouble();
           System.out.println("Enter c");
           double c = sc.nextDouble();
           

           // performing operations 
              double result1 =  a + b *c;
              double result2 = a * b + c;
              double result3 =  c + a / b;
              double result4 = a % b + c;
          
           // Displaying result
             System.out.println("The results of Double Operations are " + result1 +  ", " + result2 + ", " + result3 + " and  " + result4);


       }
}
