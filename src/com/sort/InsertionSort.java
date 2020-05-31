package com.sort;

/**
 * Insertion sort will insert value from left to right and compare values to the neighbour and keep shifting to right.
 * Time Complexity will be O(n2)
 * In Place Algorithm
 * Stable Algorithm duplicate values position will be preserved.
 * Sorted from left to right
 * Insertion sort is having lot of shifting with is solved by shell sort.
 * Insertion Sort using gap of 1
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        recursiveInsertionSort(array, array.length);

        // Iterative insertion sort logic
//        for (int firstUnsortedIndex = 1 ; firstUnsortedIndex < array.length  ; firstUnsortedIndex++){
//            int newElement = array[firstUnsortedIndex];
//            int i;
//            for (i = firstUnsortedIndex ; i > 0 && array[i-1] > newElement ; i--){
//                array[i] = array[i-1];
//            }
//            array[i] = newElement;
//        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }


    // Recursion for insertion sort logic
    private static void recursiveInsertionSort(int[] array, int numItems) {
        if (numItems < 2) {
            return;
        }
        recursiveInsertionSort(array, numItems - 1);
        int newElement = array[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }
        array[i] = newElement;

        System.out.println("Results of call when numItems = "+ numItems);
        for(int j = 0 ; j < array.length ; j++){
            System.out.print(array[j]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("--------------");
    }
}
