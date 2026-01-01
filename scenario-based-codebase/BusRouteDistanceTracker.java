
import java.util.Scanner;

public class BusRouteDistanceTracker {


          /*   19. Bus Route Distance Tracker 🚌
               Each stop adds distance.
               ● Ask if the passenger wants to get off at a stop.
               ● Use a while-loop with a total distance tracker.
               ● Exit on user confirmation.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalDistance = 0;
        char choice = 'n';
        while (true) {
            System.out.print("Enter distance covered from this stop (km): ");
            double distance = sc.nextDouble();

            totalDistance += distance;

            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                break;
            }
        }

        System.out.println("Passenger exited the bus.");
        System.out.println("Final distance travelled: " + totalDistance + " km");

        sc.close();
    }
}