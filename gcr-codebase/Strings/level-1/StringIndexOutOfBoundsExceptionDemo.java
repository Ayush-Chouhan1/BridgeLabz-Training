public class StringIndexOutOfBoundsExceptionDemo{
     
	public static void exceptionDemo(){
	    String s1 = "Exception";
		
		System.out.println(s1.charAt(20));
		}
		
	public static void expectionHandlingDemo(){
        String s1 = "Exception";
        try{
    		System.out.println(s1.charAt(20));
		}
		catch(Exception e){
    		System.out.println("Index out of bound expection");
        } 		
    }
	
	public static void main(String[] args){
	     // exceptionDemo();
		 expectionHandlingDemo();
	}

}	