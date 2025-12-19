import java.util.Scanner;


class MaxSizeLargestDigit {

    public static void main(String[] args) {
        // create object of scanner
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits
        while (number != 0) {

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //displaying result
        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        // closing scanner 
        scanner.close();
    }
}
