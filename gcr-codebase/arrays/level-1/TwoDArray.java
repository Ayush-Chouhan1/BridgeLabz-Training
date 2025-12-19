import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        //creating Scanner object
        Scanner input = new Scanner(System.in);

        //take number of rows and columns
        System.out.print("enter rows ");
        int rows = input.nextInt();
        System.out.print("enter columns ");
        int columns = input.nextInt();

        //validating input
        if (rows <= 0 || columns <= 0) {
            System.out.println("nnvalid input");
            input.close();
            return;
        }

        // Declare 2D array 
        int[][] matrix = new int[rows][columns];

        // Take input array
        System.out.println("Enter elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        //creating 1D array 
        int[] Array = new int[rows * columns];
        int index = 0;

        //elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Array[index] = matrix[i][j];
                index++;
            }
        }

        // Display array
        System.out.println("1D Array elements:");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

        //close Scanner
        input.close();
    }
}
