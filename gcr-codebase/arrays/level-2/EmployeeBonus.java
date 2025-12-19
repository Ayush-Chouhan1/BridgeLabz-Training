import java.util.Scanner;

class EmployeeBonus {

    public static void main(String[] args) {
        // creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.print("Enter salary: ");
            salary[i] = scanner.nextDouble();

            System.out.print("Enter years of service");
            yearsOfService[i] = scanner.nextDouble();

            // Validation
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.err.println("Invalid input");
                i--;
                continue;
            }
        }

        //bonus calculation 
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Bonus Paid = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        // closing Scanner
        scanner.close();
    }
}
