import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {

    // method to generate exception
    static void generateException(String[] names) {
        System.out.println(names[names.length+1]); 
    }

    // method to handle exception
    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println(" RuntimeException handled");
        }
    }

    public static void main(String[] args) {
	    
		// creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // generateException(names);
        handleException(names);
    }
}
