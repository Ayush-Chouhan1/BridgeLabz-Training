import java.util.Scanner;

public class CelsiusToFahrenheit{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter tempertaure in celsius");
	   int celsius = sc.nextInt();
	   System.out.println("Fahrenheit = " +(celsius * 9/5) + 32);
        }
    }		