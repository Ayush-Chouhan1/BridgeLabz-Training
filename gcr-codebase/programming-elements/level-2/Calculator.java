import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){
        
        //Constructing Scanner object
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter number 1 ");
        double number1 = sc.nextDouble();
        System.out.println("Enter number 2 ");
        double number2 = sc.nextDouble();

       //Arithmetic operations
        double addition = number1 + number2;
        double subtraction = number2 - number1;
        double multiplication =  number2 * number1;
        double division = number1 / number2;


       // Displaying results 
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+  number1 + " and " +number2 + " is " + addition + " " + subtraction + " " + multiplication + " and " +division);
      

    }
}

        

  
    

