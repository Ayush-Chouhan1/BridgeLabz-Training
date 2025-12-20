import java.util.Scanner;
public class TrigonometricCalculator{

     //Create method 
	 public static double [] calculaTrigno(double angle){
       	  
        double radians = Math.toRadians(angle);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		
		return new double[]{sin, cos, tan};
		}
		
	public static void main(String[] args){
 	   
	    //Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking input from user
		System.out.println("Enter angle : ");
		double angle = input.nextDouble();
		
		//Calling method
		double values[] = calculaTrigno(angle);
		
		// Displaying result
		System.out.println("Sine: " + values[0]);
        System.out.println("Cosine: " + values[1]);
        System.out.println("Tangent: " + values[2]);

    }
}	