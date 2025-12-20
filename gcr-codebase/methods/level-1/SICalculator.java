import java.util.Scanner;

public class SICalculator{

    //creating method
	  public double sI(int principal, double rate , int time){
	    double SI = principal * rate * time /100;
		return SI;
	  }
	  
	  //main method
    public static void main(String[] args){
	  
	  // creating scanner object
	  Scanner input = new Scanner(System.in);
	  
	  // Taking input from user
	  System.out.println("Enter principal");
	  int principal = input.nextInt();
	  System.out.println("Enter rate");
	  double rate = input.nextDouble();
	  System.out.println("Enter time");
	  int time = input.nextInt();
	  
	  // Create object of class
	  SICalculator simpleInterest = new SICalculator();
	  double SI = simpleInterest.sI(principal , rate , time);
	  
	  //Displaying result
	  System.out.println("The Simple Interest is " + SI + " for Principal " + principal + ", Rate of Interest " + rate +" and Time "+ time);
	  
	  
	  }
}	  