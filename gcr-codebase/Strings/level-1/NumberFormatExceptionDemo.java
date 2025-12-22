import java.util.Scanner;

class NumberFormatExceptionDemo {

    // method to generate exception
    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    // method to handle exception
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value ");
        String text = sc.nextLine();

        // generateException(text);
        handleException(text);
    }
}
