package com.sort;

/**
 * Select a largest value and swap at last and less swapping then bubble sort
 * Time Complexity will be O(n2)
 * In Place Algorithm
 * Unstable Algorithm duplicate position won't be preserved.
 * Sorted from right to left
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
        printArray(array);
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }
}
