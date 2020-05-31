package com.sort;


/**
 * Counting Sort makes assumptions about data and this algorithm only works non-negative discrete values and values should be specific ranges.
 * Counting Array never compare values with each others.
 * Not in place Algorithm with Time Complexity O(n) because we are assuming data that's why we can achieve linear time.
 * Counting array perfectly works when range of values is equivalent to sort values.
 * UnStable Algorithm
 */
public class CountingSort {

    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(array, 1, 10);
        printArray(array);
    }

    private static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }
}
