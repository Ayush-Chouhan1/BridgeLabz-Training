import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array 
        double[] heights = new double[11];

        double sum = 0.0;

        // Take input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        // Display mean height
        System.out.println("Mean height of football team = " + meanHeight);

        // Close scanner
        input.close();
    }
}
