import java.util.Scanner;
public class ClaculateSimpleInterest{
  public staic void  main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Principal amount ");
       int principal = sc.nextInbt();
       System.out.println("Enter Rate");
       double rate = sc.nextDouble();
       System.out.println("Enter Time");
       int time = sc.nextInt();
       double sI = (principal * rate * time)/100;
       System.out.println("Simple intreset = " + sI);
       }
   }
