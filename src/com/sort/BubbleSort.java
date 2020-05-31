package com.sort;

/**
 * Bubble up the largest value at the end and compare values to the neighbour and keep shifting to right.
 * Time Complexity will be O(n2)
 * In Place Algorithm
 * Stable Algorithm duplicate values position will be preserved.
 * Sorted from right to left
 * Shell Sort can reduce swapping in bubble sort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
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
