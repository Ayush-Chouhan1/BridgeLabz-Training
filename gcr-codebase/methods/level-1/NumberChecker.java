import java.util.Scanner;

class NumberChecker {

    // Method to check number sign
    public int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        
		// Creating scanner clasas object
        Scanner scanner = new Scanner(System.in);

         // taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        //creating object of class
        NumberChecker checker = new NumberChecker();
        int result = checker.checkNumber(number);

        // Displaying result
        System.out.println("Result: " + result);
    }
}
