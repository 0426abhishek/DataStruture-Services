package com.sort;

/**
 * QuickSort use Divided and conquer and recursive Algorithm.
 * It used to choose pivot element which make left side values will be smaller and right side values will be greater than pivot.
 * Doesn't requires extra array, so don't need lot of memory to sort as Merge Sort.
 * In place Algorithm with Time Complexity of Average case O(nlogn) - base 2, Worst case its quadratic(n2) and partitioning array into 2 halves.
 * Unstable Algorithm.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        printArray(array);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i < j) {

            //Note Empty Loop Body
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }

            // Note Empty Loop Body
            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;

    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }
}
