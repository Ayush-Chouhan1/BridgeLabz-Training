import java.util.Scanner;

class NumberSum {

    // Method to find sum using loop
    public int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        // creating object of scanner 
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        // Calling mathod
        NumberSum calculator = new NumberSum();
        int sum = calculator.findSum(n);

        // Displaying result
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
}
