package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class InsuranceClaim {
	private String claimType;
	private double claimAmount;

	public InsuranceClaim(String claimType, double claimAmount) {
		this.claimType = claimType;
		this.claimAmount = claimAmount;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getClaimAmount() {
		return claimAmount;
	}
}

public class InsuranceClaimAnalysis {

	public static void main(String[] args) {

		List<InsuranceClaim> claims = Arrays.asList(new InsuranceClaim("HEALTH", 50000),
				new InsuranceClaim("VEHICLE", 20000), new InsuranceClaim("HEALTH", 70000),
				new InsuranceClaim("LIFE", 100000), new InsuranceClaim("VEHICLE", 30000),
				new InsuranceClaim("LIFE", 150000));

		// Group by claim type and calculate average amount
		Map<String, Double> averageClaimAmountByType = claims.stream().collect(Collectors
				.groupingBy(InsuranceClaim::getClaimType, Collectors.averagingDouble(InsuranceClaim::getClaimAmount)));

		// Print result
		averageClaimAmountByType.forEach((type, avg) -> System.out.println(type + " -> Average Claim Amount: " + avg));
	}
}
