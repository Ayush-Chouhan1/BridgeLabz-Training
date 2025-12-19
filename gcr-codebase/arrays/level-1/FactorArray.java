import java.util.Scanner;

public class FactorArray{
   public static void main(String[] args){
      
	  // creating scanner object
	  Scanner input = new Scanner(System.in);
	  
	  // taking input from user
	  int number = input.nextInt();
	  
	  // validating input
	  if(number<=0){
	  System.out.println("invalid input");
	  return;}
	  
	  //declaring array
	  int maxSize = 10;
	  int[] factors = new int[maxSize];
      int index=0;	  
	  
	  // finding factors
	  for(int i=1;i<=number ;i++){
	     if(number%i==0){
		   
		   if(index == maxSize){
		    maxSize= maxSize*2;
			int[] temp = new int[maxSize];
			
			for(int j =0;j< factors.length;j++){
			   temp[j] = factors[j];
			     }
			factors = temp;

			  }
			  factors[index] = i;
			  index++;
			     }
			  }
			  
			  // displaying result
			 System.out.println("factors of "+number);
			 for(int i=0;i<index;i++){
			   System.out.print( factors[i] +" ");
			   }
			   
			   // closing scanner
			   input.close();
			   
		}
	}
			  