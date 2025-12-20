import java.util.Scanner;

public class RecursiveSum{

    public static int sum(int n){
	  int sum=n;
	  if(n==0){
	     return sum;
		 }
		 else {
		  return sum + sum(n-1);
		 }
		} 
  public static void main(String [] args){
     
	 //Create Scanner object
	 Scanner input = new Scanner(System.in);
	 
	 //Taking input from user
	 System.out.println("Enter a number");
	 int n = input.nextInt();
	 
	 // Calculating using formula
	 int sumFormula = n*(n+1)/2;
	 
	 
	 //Calling method
	 int sumRecursive = sum(n);
	 //Displaying result
	 if(sumRecursive == sumFormula){
	 System.out.println("same result");
	  }
	 else {
	 	 System.out.println("not same result");
		 }
		 
	}
	
}	

	 
	 
	 