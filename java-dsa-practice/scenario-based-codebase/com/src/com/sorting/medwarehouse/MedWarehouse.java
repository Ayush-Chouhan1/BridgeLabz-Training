package com.sorting.medwarehouse;

public class MedWarehouse {

	// Merge Sort method
	public static void mergeSort(Medicine[] meds, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(meds, left, mid);

			mergeSort(meds, mid + 1, right);

			merge(meds, left, mid, right);
		}
	}

	private static void merge(Medicine[] meds, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] leftArr = new Medicine[n1];
        Medicine[] rightArr = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = meds[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = meds[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].expiryDay <= rightArr[j].expiryDay) {
                meds[k++] = leftArr[i++];
            } else {
                meds[k++] = rightArr[j++];
            }
        }

       while (i < n1)
            meds[k++] = leftArr[i++];

        while (j < n2)
            meds[k++] = rightArr[j++];
    }

	// Display sorted medicine list
	public static void displayMedicines(Medicine[] meds) {
	
		for (Medicine m : meds) {
			System.out.println("ID: " + m.medicineId + ", Name: " + m.name + ", Expires in: " + m.expiryDay + " days");
		}
	}

	// Alert for medicines nearing expiry
	public static void alertNearExpiry(Medicine[] meds, int thresholdDays) {
		System.out.println("\n medicines Nearing Expiry (≤ " + thresholdDays + " days)");
		for (Medicine m : meds) {
			if (m.expiryDay <= thresholdDays) {
				System.out.println(m.name + " (Expires in " + m.expiryDay + " days)");
			}
		}
	}

	// Driver method
	public static void main(String[] args) {

		// Combined branch-wise sorted data
		Medicine[] medicines = { new Medicine(401, "Paracetamol", 5), new Medicine(402, "Cough Syrup", 12),
				new Medicine(403, "Antibiotic", 3), new Medicine(404, "Vitamin C", 20),
				new Medicine(405, "Insulin", 2) };

		// Sort by expiry date
		mergeSort(medicines, 0, medicines.length - 1);

		// Display list
		displayMedicines(medicines);

		// Alert critical medicines
		alertNearExpiry(medicines, 7);
	}
}
