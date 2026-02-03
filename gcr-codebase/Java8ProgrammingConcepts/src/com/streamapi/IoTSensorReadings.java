package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {

	public static void main(String[] args) {

		List<Double> readings = Arrays.asList(18.5, 22.3, 30.7, 25.0, 35.2, 19.8);

		double threshold = 25.0;

		readings.stream()
				// keep only readings above threshold
				.filter(reading -> reading > threshold)

				// print each qualifying reading
				.forEach(reading -> System.out.println("Alert! High Reading: " + reading));
	}
}
