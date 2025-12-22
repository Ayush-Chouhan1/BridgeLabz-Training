import java.util.Scanner;

class StudentGradeCalculator {

    // fixed values
    static final int TOTAL_STUDENTS = 10;
    static final int SUBJECTS = 3;

    // generating random 2-digit marks 
    public static int[][] generateMarks() {

        int[][] marks = new int[TOTAL_STUDENTS][SUBJECTS];

        for (int i=0;i< TOTAL_STUDENTS;i++) {
            for (int j =0; j< SUBJECTS; j++) {
                marks[i][j] = (int) (Math.random()* 51)+ 50; 
            }
        }
        return marks;
    }

    // calculate total, average and percentage
    public static double[][] calculateResult(int[][] marks) {

        double[][] result = new double[TOTAL_STUDENTS][3];

        for (int i =0;i<TOTAL_STUDENTS;i++) {

            int total = 0;
            for (int j = 0; j< SUBJECTS; j++) {
                total += marks[i][j];
            }

            double average = total / (double) SUBJECTS;
            double percentage = (total/ (double) (SUBJECTS * 100)) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0)/ 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // calculate grade based on percentage
    public static String[] calculateGrades(double[][] result) {

        String[] grades = new String[TOTAL_STUDENTS];

        for (int i=0;i<TOTAL_STUDENTS;i++) {

            double percentage = result[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // display scorecard
    public static void displayScoreCard(int[][] marks,
                                        double[][] result,
                                        String[] grades) {

        System.out.println(
            "Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println(
            "---------------------------------------------------------------");

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println(
                (i + 1) + "\t" +marks[i][0] + "\t" +marks[i][1] + "\t" +marks[i][2] + "\t" +
                (int) result[i][0] + "\t" +result[i][1] + "\t" +result[i][2] + "\t" +
                grades[i]);
        }
    }

    public static void main(String[] args) {

        int[][] pcmMarks = generateMarks();
        double[][] result = calculateResult(pcmMarks);
        String[] grades = calculateGrades(result);

        displayScoreCard(pcmMarks, result, grades);
    }
}
