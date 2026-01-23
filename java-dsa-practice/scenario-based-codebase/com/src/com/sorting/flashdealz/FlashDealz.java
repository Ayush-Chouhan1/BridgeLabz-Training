package com.sorting.flashdealz;

public class FlashDealz {

	// Quick sort method
	public static void quickSort(Product[] product, int low, int high) {

		if (low < high) {
			int pivotIndex = partition(product, low, high);
			quickSort(product, low, pivotIndex-1);
			quickSort(product, pivotIndex + 1, high);
		}
	}

	// Partition method
	public static int partition(Product[] arr, int low, int high) {
		int i = low - 1;
		Product pivot = arr[high];

		for (int j = low; j < high ; j++) {
			if (arr[j].discount < pivot.discount) {
				i++;
				Product temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}

		}
		// final swap for pivot
		Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
		return i+1;
	}

}
