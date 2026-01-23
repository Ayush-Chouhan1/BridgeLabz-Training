package com.sorting.foodfest;

public class FoodFest {

	// Merge Sort method
	public static void mergeSort(Stall[] stalls, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(stalls, left, mid);

			mergeSort(stalls, mid + 1, right);

			merge(stalls, left, mid, right);
		}
	}

	// Merge two sorted subarrays
	private static void merge(Stall[] stalls, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Stall[] leftArr = new Stall[n1];
		Stall[] rightArr = new Stall[n2];

		for (int i = 0; i < n1; i++) {
			leftArr[i] = stalls[left + i];
		}

		for (int j = 0; j < n2; j++) {
			rightArr[j] = stalls[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (leftArr[i].footfall <= rightArr[j].footfall) {
				stalls[k++] = leftArr[i++];
			} else {
				stalls[k++] = rightArr[j++];
			}
		}

		// Copy remaining elements
		while (i < n1) {
			stalls[k++] = leftArr[i++];
		}

		while (j < n2) {
			stalls[k++] = rightArr[j++];
		}
	}

	// Display master performance list
	public static void displayStalls(Stall[] stalls) {
		for (Stall s : stalls) {
			System.out.println("Stall ID: " + s.stallId + ", Name: " + s.stallName + ", Footfall: " + s.footfall);
		}
	}

	// Driver method
	public static void main(String[] args) {

		// Zone-wise sorted daily logs
		Stall[] stalls = { new Stall(101, "Burger Hub", 120), new Stall(102, "Pizza Point", 150),
				new Stall(103, "Taco Town", 150), new Stall(104, "Sweet Treats", 200),
				new Stall(105, "Spice Villa", 180) };

		// Merge and sort all zone data
		mergeSort(stalls, 0, stalls.length - 1);

		// Display master list
		displayStalls(stalls);
	}
}
