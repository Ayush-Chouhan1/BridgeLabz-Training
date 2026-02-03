package com.smartcitytransport;

import java.util.*;
import java.util.stream.*;

public class SmartCitySystem {

	public static void main(String[] args) {

		List<TransportService> services = Arrays.asList(new BusService("Bus A", 20, 9), new BusService("Bus B", 15, 7),
				new TaxiService("Taxi p", 100, 8), new TaxiService("Taxi Q", 180, 6), new AmbulanceService());

		// ️Lambda → filter + sort
		System.out.println("Earliest & Cheapest Services:");
		services.stream().filter(s -> !(s instanceof EmergencyService))
				.sorted(Comparator.comparing(TransportService::getFare)
						.thenComparing(TransportService::getDepartureTime))
				.forEach(TransportService::printServiceDetails);

		// Method reference → dashboard print
		System.out.println("\nLive Dashboard:");
		services.forEach(TransportService::printServiceDetails);

		// ️Functional interface → fare calculation
		FareCalculator calc = (base, dist) -> base + dist * 5;
		double fare = calc.calculateFare(50, 10);
		System.out.println("\nCalculated Fare: " + fare);

		// Collectors → grouping revenue
		Map<String, Double> revenue = services.stream().collect(Collectors.groupingBy(TransportService::getServiceName,
				Collectors.summingDouble(TransportService::getFare)));

		System.out.println("\nRevenue Summary: " + revenue);

		// ️Partition peak vs non-peak
		Map<Boolean, List<TransportService>> peak = services.stream()
				.collect(Collectors.partitioningBy(s -> s.getDepartureTime() >= 8));

		System.out.println("\nPeak Services: " + peak.get(true).size());

		// Emergency detection
		System.out.println("\nEmergency Services:");
		services.stream().filter(s -> s instanceof EmergencyService).forEach(TransportService::printServiceDetails);
	}
}