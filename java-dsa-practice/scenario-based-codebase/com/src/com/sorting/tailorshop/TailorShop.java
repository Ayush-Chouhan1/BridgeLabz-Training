package com.sorting.tailorshop;

public class TailorShop {

	// Insertion Sort based on delivery deadline 
	public static void insertionSort(Order[] orders) {

		int n = orders.length;

		for (int i = 1; i < n; i++) {

			Order key = orders[i];
			int j = i - 1;

			while (j >= 0 && orders[j].deliveryDay > key.deliveryDay) {
				orders[j + 1] = orders[j];
				j--;
			}

			orders[j + 1] = key;
		}
	}

	// Display sorted order list
	public static void displayOrders(Order[] orders) {
		for (Order o : orders) {
			System.out.println(
					"Order ID: " + o.orderId + ", Customer: " + o.customerName + ", Delivery Day: " + o.deliveryDay);
		}
	}

	// Driver method
	public static void main(String[] args) {

		Order[] orders = { new Order(301, "Aman", 1), new Order(302, "Riya", 2), new Order(303, "Kunal", 4),
				new Order(304, "Neha", 3), // newly added order
				new Order(305, "Vikas", 5) };

		// Sort orders by delivery deadline
		insertionSort(orders);

		// Display final schedule
		displayOrders(orders);
	}
}
