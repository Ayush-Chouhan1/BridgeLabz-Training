import java.util.Scanner;
   
 public class  IntOperation{
         public static void main(String[] args){
       

        //Constructing Scanner object
          Scanner sc = new Scanner(System.in);

        // taking input from user
           System.out.println("Enter a");
           int a = sc.nextInt();
           System.out.println("Enter b");
           int b = sc.nextInt();
           System.out.println("Enter c");
           int c = sc.nextInt();
           

           // performing operations 
              int result1 =  a + b *c;
              int result2 = a * b + c;
              int result3 =  c + a / b;
              int result4 = a % b + c;
          
           // Displaying result
             System.out.println("The results of Int Operations are " + result1 +  ", " + result2 + ", " + result3 + " and  " + result4);


       }
}
