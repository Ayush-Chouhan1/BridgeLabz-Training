import java.util.Scanner;

public class MultiplicatioTable {
    public static void main(String[] args) {

        // creating scanner class object
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter number");
        int number = input.nextInt();

        // declaring array
        int result[] = new int[10];

        // storing multiplication result
        for (int i = 0; i < result.length; i++) {
            result[i] = number * (i + 1);
        }

        // displaying result
        for (int i = 0; i < result.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + result[i]);
        }

        input.close();
    }
}
 