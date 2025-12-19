import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner input = new Scanner(System.in);

        // Declaring an array 
        int[] ages = new int[10];

        // Taking input 
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        for (int i=0;i<ages.length;i++) {

            // Validate age
            if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            } 
            // Check voting condition
            else if(ages[i]>=18) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("student with the age " + ages[i] + " cannot vote");
            }
        }
        // Close scanner resource
        input.close();
    }
}
