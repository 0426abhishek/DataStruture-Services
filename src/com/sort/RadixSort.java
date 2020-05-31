package com.sort;

import java.util.Arrays;

/**
 * Radix Sort make assumption about data and data must be radix and width.
 * Radix Support integer and string. its stable algorithm
 * O(n) can be achieve but its run slower than O(nlogn) because of overhead involved.
 * In place and stable algorithm.
 * It works in case of Stable Algorithm  so it make Counting sort as stable.
 * Through linked list also we can stable counting sort.
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] array = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(array, 10, 4);
        printArray(array);
    }

    private static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    private static void radixSingleSort(int[] array, int position, int radix) {
        int numItems = array.length;

        int[] countArray = new int[radix];
        for (int value : array) {
            countArray[getDigit(position, value, radix)]++;
        }
        System.out.println(Arrays.toString(countArray));

        //Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        System.out.println("added the countArray " + Arrays.toString(countArray));

        int[] temp = new int[numItems];
        // To make counting sort stable
        // So traverse the array from right to left
        for(int tempIndex = numItems -1; tempIndex >=0 ; tempIndex--){
            temp[--countArray[getDigit(position,array[tempIndex],radix)]] = array[tempIndex];
        }
        for (int j = 0 ; j < numItems ; j++){
            array[j] = temp[j];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }
}
