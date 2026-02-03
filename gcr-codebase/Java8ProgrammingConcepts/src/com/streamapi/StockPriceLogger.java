package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

	public static void main(String[] args) {

		List<Double> stockPrices = Arrays.asList(1023.50, 1018.75, 1025.10, 1030.40, 1022.90);

		// Print all stock price updates
		stockPrices.forEach(price -> System.out.println("Stock Price Update: " + price));
	}
}
