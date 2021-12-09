package com.sortingalgorithms;

public class InsertionSort {

	public InsertionSort() {
	}

	public void insertSort(int[] arr) {
		int length = arr.length;
		int j = 0;
		for (int i = 1; i < length; i++) {
			j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			System.out.print("After pass " + i + ": ");
			printArray(arr);
		}

		System.out.print("\nAfter sorting: ");
		printArray(arr);
	}

	public void insertionSortRecursive(int[] arr, int n) {
		// Base case
		if (n <= 1)
			return;

		// Sort first n-1 elements
		insertionSortRecursive(arr, n - 1);

		// Insert last element at its correct position
		// in sorted array.
		int last = arr[n - 1];
		int j = n - 2;

		/*
		 * Move elements of arr[0..i-1], that are greater than key, to one position
		 * ahead of their current position
		 */
		while (j >= 0 && arr[j] < last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}

	public void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}
}
