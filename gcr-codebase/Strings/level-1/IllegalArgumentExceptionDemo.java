import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    // method to generate exception
    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }
  
    // method to handle exception
    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("IllegalArgumentException handled");
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // generateException(text);
        handleException(text);
    }
}
