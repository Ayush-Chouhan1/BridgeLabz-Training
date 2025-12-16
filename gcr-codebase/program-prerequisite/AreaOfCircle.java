import java.util.Scanner;
  public class AreaOfCircle{
    public static void main{
	  Scanner sc = new Scanner(System.in);
	   System.out.println("Enter radius");
	    double radius = sc.nextDouble();
		double pi = Math.PI;
		System.out.println("Area of circle = " + ( pi*(radius * radius)));
		}
	  }	