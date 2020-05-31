package com.sort;

import java.util.Arrays;

/**
 * Radix Sort algorithm according to alphabetical sort.
 */
public class RadixSortAlphabetical {
    public static void main(String[] args) {
        String[] array = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(array, 26, 5);
        printArray(array);
    }

    private static void radixSort(String[] array, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(array, i, radix);
        }
    }

    private static void radixSingleSort(String[] array, int position, int radix) {
        int numItems = array.length;

        int[] countArray = new int[radix];
        for (String value : array) {
            countArray[getIndex(position, value)]++;
        }
        System.out.println(Arrays.toString(countArray));

        //Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        System.out.println("added the countArray " + Arrays.toString(countArray));

        String[] temp = new String[numItems];
        // To make counting sort stable
        // So traverse the array from right to left
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, array[tempIndex])]] = array[tempIndex];
        }
        for (int j = 0; j < numItems; j++) {
            array[j] = temp[j];
        }
    }

    private static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }
}
