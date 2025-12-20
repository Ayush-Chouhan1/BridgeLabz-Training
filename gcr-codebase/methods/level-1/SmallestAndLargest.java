import java.util.Scanner;

class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
	
        // Creating object of Scanner
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Declaring  String Array to store result
        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}
