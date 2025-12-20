import java.util.Scanner;

class QuotientAndRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        
		// Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        // Calling methos
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
