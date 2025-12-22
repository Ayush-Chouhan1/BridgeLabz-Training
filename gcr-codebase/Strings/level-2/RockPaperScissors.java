import java.util.Scanner;

public class RockPaperScissors {

    // method to generate computer choice
    public static String getComputerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    // ethod to find winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    // Method to calculate stats
    public static String[][] calculateStats(int userWins, int computerWins, int games) {

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100) / games);

        return stats;
    }

    // Method to display stats
    public static void displayStats(String[][] stats) {

        System.out.println("\nPlayer\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +stats[i][1] + "\t" +stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games= ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("Game " + i +
                    " Enter choice  ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            System.out.println("Computer Choice: " + computerChoice);

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayStats(stats);
    }
}
