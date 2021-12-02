package com.sortingalgorithms;
public class Main {
    public static void main(String[] args){
        int testArray1[] = {2,4,7,5,8,5,3,9,6};
        int testArray2[] = {3,1,5,8,2,6,4,9,7};
        int testArray3[] = {6,3,7,2,1,6,5,4,9};

        App.recursiveBubbleSort(testArray1, testArray1.length);
        System.out.println("testArray1: ");
        App.printArray(testArray1);

        App.recursiveSelectionSort(testArray2, testArray2.length, 0);
        System.out.println("\ntestArray2: ");
        App.printArray(testArray2);

        App.recursiveInsertionSort(testArray3, testArray3.length);
        System.out.println("\ntestArray3: ");
        App.printArray(testArray3);

    }
    
}
