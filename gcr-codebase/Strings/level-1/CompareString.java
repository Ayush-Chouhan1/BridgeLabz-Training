import java.util.Scanner;

public class CompareString{

     // Method for comparing using for loop
     public static boolean compareString(String s1 , String s2){
	    if(s1.length() != s2.length()){
	      return false;
		 }
	    for(int i=0;i<s1.length();i++){
		    if(s1.charAt(i)!=s2.charAt(i)){
			   return false;
			}
	    }   
		return true;
	}
	 public static void main(String [] args){
	      
		  //creating object of scanner class
		  Scanner input = new Scanner(System.in);
		  
		  // Taking input from user
		  System.out.println("Enter String 1");
		  String str1 = input.next();
		  System.out.println("Enter String 2");
		  String str2 = input.next();
		  
		  // comparing through built in method result and explicit method
		  if(compareString(str1 , str2) == str1.equals(str2)){
		      System.out.println("Both give same result");
			  }
		  else{
		      System.out.println("Diffrent resuult");
			   }
		  
		// closing scanner
		input.close();
		  
	}
}	