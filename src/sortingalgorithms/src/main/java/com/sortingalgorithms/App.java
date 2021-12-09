/**
 *  Filename: App.java
 */

package com.sortingalgorithms;


/** 
 * Rewrite Bubble Sort, Selection Sort and Insertion Sort using recursion
 * @author Group  - SJCC_CIS055
 * @version 1.0 - 11/26/2021
 */

public class App 
{


// Recursive Bubble Sort
public static void recursiveBubbleSort(int [] arr, int arrLength){
    if (arrLength <= 1){
        return;
    }

    for (int i = 0; i < arrLength - 1; i++){
        if (arr[i] < arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    recursiveBubbleSort(arr, arrLength - 1);
}


// Recursive Selection Sort
public static void recursiveSelectionSort(int [] arr, int arrLength, int i){
    if (i >= arrLength - 1){
        return;
    }

    int indexOfMax = i;
    for (int k = i + 1; k < arrLength; k++){
        if (arr[k] > arr[indexOfMax]){
            indexOfMax = k;
        }
    }
    int temp = arr[i];
    arr[i] = arr[indexOfMax];
    arr[indexOfMax] = temp;

    recursiveSelectionSort(arr, arrLength, i + 1);
}

// Recursive Insertion Sort
public static void recursiveInsertionSort(int [] arr, int arrLength){
	// Base case
	if (n <= 1)
		return;

	//Call recursive function with n-1 element
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


// Print Array
public static void printArray(int [] arr){
    for (int i = 0; i < arr.length; i++){
        System.out.printf("%d ", arr[i]);
    }
}

// main function
public static void main( String[] args )
    {
    	// nomarl interge number
        int testArray1[] = {2,4,7,5,8,5,3,9,6};
        // negative number and zero number
        int testArray2[] = {3,1,5,0,2,-6,4,9,7};
        // dulpicate number
        int testArray3[] = {6,3,7,2,1,6,5,4,9};

        recursiveBubbleSort(testArray1, testArray1.length);
        System.out.println("testArray1: ");
        printArray(testArray1);

        recursiveSelectionSort(testArray2, testArray2.length, 0);
        System.out.println("\ntestArray2: ");
        printArray(testArray2);

        System.out.println("====================TEST CASE 1=====================");
		System.out.print("Before Insertion Sort: ");
		printArray(testArray1);
		recursiveInsertionSort(testArray1, testArray1.length);
		System.out.print("After Insertion Sort: ");
		printArray(testArray1);

		System.out.println("====================TEST CASE 2=====================");
		System.out.print("Before Insertion Sort: ");
		printArray(testArray2);
		recursiveInsertionSort(testArray2, testArray2.length);
		System.out.print("After Insertion Sort: ");
		printArray(testArray2);

		System.out.println("====================TEST CASE 3=====================");
		System.out.print("Before Insertion Sort: ");
		printArray(testArray3);
		recursiveInsertionSort(testArray3, testArray3.length);
		System.out.print("After Insertion Sort: ");
		printArray(testArray3);

      
    }
}



