package com.sorting.eduresult;

public class EduResult {

	public static void mergeSort(Student[] student, int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(student, left, mid);
			mergeSort(student, mid + 1, right);
			merge(student, left, mid, right);
		}
	}

	public static void merge(Student[] arr, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}

		for (int i = 0; i < n2; i++) {
			R[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i].marks >= R[j].marks) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		while (i < n1) {
			arr[k++] = L[i++];
		}

		while (j < n2) {
			arr[k++] = R[j++];
		}

	}

}
