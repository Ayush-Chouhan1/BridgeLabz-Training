import java.util.Scanner;


public class NumberGuessing{
    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        boolean result=false;
        int tries =5;
        int num =(int) (Math.random() * 100) + 1;

        System.out.println("-----------NUMBER GUESSING-------------");
        do{
           System.out.println("guess number  1 to 100");
           int n = sc.nextInt();
           if(n>num){
               System.out.println("too high \n try again");
               tries--;
               System.out.println("Tries left = "+tries);
           }
           else if(n<num){
               System.out.println("too low \n try again");
               tries--;
               System.out.println("Tries left = "+tries);
           }
           else if(n==num){
               System.out.println("Congratulations.. You guessed it right");
               System.out.println("The number was = " +num);
               result=true;
           }
            if(tries==0) System.out.println("Sorry. You are out of trials");
        }while(result || tries!=0);


    }
}
