import java.util.Scanner;

public class SubstringComparasion{


     // Method to create subString
	 public static String subStringS(String s1, int start, int end){
	    String sub ="";
		
		for(int i=start;i<end;i++){
		    sub+=s1.charAt(i);
		}
        return sub;
    }		
		    
     public static void main(String[] args){
	    
		// Create object of scanner class
		Scanner input = new Scanner(System.in);
		
		// Taking input from user
		System.out.println("Enter string 1 ");
		String Str1 = input.next();
		System.out.println("Enter Starting index");
		int start = input.nextInt();
		System.out.println("Enter Ending index");
		int end = input.nextInt();
		
        System.out.println(subStringS(Str1, start, end));
		System.out.println(Str1.substring(start, end));
		System.out.println(subStringS(Str1, start, end)== Str1.substring(start, end));

		
	}
}	
		
		