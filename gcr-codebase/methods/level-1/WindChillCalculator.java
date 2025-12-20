import java.util.Scanner;

class WindChillCalculator {

    // Create method
    public double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {
        
		// Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = scanner.nextDouble();

        // Calling mehtod
        WindChillCalculator calculator = new WindChillCalculator();
        double result = calculator.calculateWindChill(temperature, windSpeed);

        // Displaying result
        System.out.println("Wind Chill Temperature: " + result);
    }
}
