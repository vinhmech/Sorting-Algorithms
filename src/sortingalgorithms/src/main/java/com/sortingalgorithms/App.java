/**
 *  Filename: App.java
 */

package com.sortingalgorithms;


/** 
 * Rewrite Bubble Sort, Selection Sort and Insertion Sort using recursion
 * @author Group Vinh Nguyen, Trang Lam, Quang Nguyen  - SJCC_CIS055
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
public static void recursiveInsertionSort(int [] arr, int i){
    if (i == arr.length){
        return;
    }

    if(i < arr.length){
        int temp = arr[i];
        int j = i;
        while(j > 0 && arr[j-1] <= temp){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = temp;
    }
    recursiveInsertionSort(arr, i + 1);
}


// Print Array
public static void printArray(int [] arr){
    for (int i = 0; i < arr.length; i++){
        System.out.printf("%d ", arr[i]);
    }
    System.out.println();
}

// main function
public static void main( String[] args )
    {
        int testArray1[] = {2,4,7,5,8,5,3,9,6};
        int testArray2[] = {3,1,5,8,2,6,4,9,7};
        int testArray3[] = {6,3,7,2,1,6,5,4,9};

        System.out.println("testArray1 before recursive bubble sort: ");
        printArray(testArray1);
        recursiveBubbleSort(testArray1, testArray1.length);
        System.out.println("testArray1 after recursive bubble sort: ");
        printArray(testArray1);

        System.out.println();

        System.out.println("testArray2 before recursive selection sort: ");
        printArray(testArray2);
        recursiveSelectionSort(testArray2, testArray2.length, 0);
        System.out.println("testArray2 after recursive selection sort: ");
        printArray(testArray2);

        System.out.println();

        System.out.println("testArray3 before recursive insertion sort: ");
        printArray(testArray3);
        recursiveInsertionSort(testArray3, 0);
        System.out.println("testArray3 after recursive insertion sort: ");
        printArray(testArray3);
    }
}



