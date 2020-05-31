package com.sort;

/**
 * Divide and conquer algorithm in that case splitting will be arranging the array and merging will actually sort the array.
 * Not in place algorithm while merging we use temporary array and while splitting we use same array.
 * Time Complexity O(nlogn) - base 2 because we are dividing the array in half during splitting phase.
 * Stable Algorithm.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array, 0, array.length);
        printArray(array);
    }

    public static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {

        // change the order to ascending.
        if (array[mid - 1] <= array[mid]) {
            return;
        }
        // change the order to descending.
//        if (array[mid - 1] >= array[mid]) {
//            return;
//        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
            // change the order to descending.
            //temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }

}

