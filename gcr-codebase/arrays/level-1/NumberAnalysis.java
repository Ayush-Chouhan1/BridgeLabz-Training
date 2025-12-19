import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input =new Scanner(System.in);

        //Declare integer array 
        int[] numbers = new int[5];

        //Taking input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number ");
            numbers[i] = input.nextInt();
        }

        // creating logic
        for (int i=0;i<numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i]%2==0) {
                    System.out.println(numbers[i] + "is positive and even");
                } else {
                    System.out.println(numbers[i]+ " is positive and odd");
                }
            } 
            else if (numbers[i]<0) {
                System.out.println(numbers[i] +" is negative");
            } 
            else {
                System.out.println(numbers[i] +" is zero");
            }
        }

        // Comparing first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("first and last elements are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("first element is greater than last element");
        } else {
            System.out.println("Last element is greater than first element");
        }
        // Close scanner
        input.close();
    }
}
