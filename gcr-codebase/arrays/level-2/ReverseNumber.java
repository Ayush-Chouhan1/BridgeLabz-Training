import java.util.Scanner;

class ReverseNumber {

    public static void main(String[] args) {

        // creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        int temp = number;
        int count = 0;


        // counting digit
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

     
	    // displaying output
        System.out.print("Reversed Number ");
        for (int digit : digits) {
            System.out.print(digit);
        }

        // displaying result
        scanner.close();
    }
}
