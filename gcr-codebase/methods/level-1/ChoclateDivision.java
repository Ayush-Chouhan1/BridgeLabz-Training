import java.util.Scanner;

public class ChoclateDivision{

    // Create method to divide chocolate
    public static int[] findChocolateDivision(int chocolate, int children){
	 
	  int arr1 = chocolate/children;
	  int arr2 = chocolate%children;
      return  new int[]{arr1 , arr2};
	  }
	  
   public static void main(String[] args){
       
    // Create Scanner object
    Scanner sc = new Scanner(System.in);

    // Take input from user
    System.out.println("Enter number of chocolate");
    int N = sc.nextInt();
    System.out.println("Enter number of children");
	int M = sc.nextInt();
	
	 
	// Calling method
	int result[] = findChocolateDivision(M , N);
	
	
	//Displaying result
	System.out.println("Number of chocolate each children will get : " + result[0]);
	System.out.println("Number of chocolate remaining : " + result[1]);

	}
}	
