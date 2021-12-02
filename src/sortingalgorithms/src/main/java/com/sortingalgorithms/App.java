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
    if (i == arrLength - 1){
        return;
    }

    int indexOfMin = i;
    for (int k = i + 1; k < arrLength; k++){
        if (arr[k] > arr[indexOfMin]){
            indexOfMin = k;
        }
    }
    int temp = arr[i];
    arr[i] = arr[indexOfMin];
    arr[indexOfMin] = temp;

    recursiveSelectionSort(arr, arrLength, i + 1);
}



// Recursive Insertion Sort
public static void recursiveInsertionSort(int [] arr, int arrLength){
    if (arrLength <= 1){
        return;
    }

    recursiveInsertionSort(arr, arrLength - 1);

    int val = arr[arrLength - 1];
    int pos = arrLength - 2;
    while(pos >= 0 && val > arr[pos]){
        arr[pos + 1] = arr[pos];
        pos = pos - 1;
    }
    arr[pos + 1] = val;
}


// Print Array
public static void printArray(int [] arr){
    for (int i = 0; i < arr.length; i++){
        System.out.printf("%d ", arr[i]);
    }
}

// main function
<<<<<<< HEAD
public static void main( String[] args )
    {
        int arr[] = {1,2,10,5,3,6,4,7,8,9};
        //recursiveBubbleSort(arr, arr.length);
        recursiveSelectionSort(arr, arr.length, 0);
        //recursiveInsertionSort(arr, arr.length);
        printArray(arr);
    }
=======
// public static void main( String[] args )
//     {
//         int arr[] = {1,2,10,5,3,6,4,7,8,9};
//         //recursiveBubbleSort(arr, arr.length);
//         //recursiveSelectionSort(arr, arr.length, 0);
//         recursiveInsertionSort(arr, arr.length);
//         printArray(arr);
//     }
>>>>>>> ebe2976368d1e0acff6a07d79fd3a4040e3e5068
}
