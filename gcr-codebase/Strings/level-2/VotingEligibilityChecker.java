import java.util.Scanner;

public class VotingEligibilityChecker {

    // method to generate random ages
    public static int[] generateAges(int count) {

        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = (int) (Math.random() * 100);
        }
        return ages;
    }

    // method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

             if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // method to display table
    public static void displayTable(String[][] table) {

        System.out.println("Age\tVoting Status");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking input from user
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        int[] ages = generateAges(count);
        String[][] result = checkVotingEligibility(ages);

        displayTable(result);
    }
}
