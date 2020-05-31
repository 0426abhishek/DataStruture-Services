package com.sort;

/**
 * Shell sort will compare elements that are farther apart and keep shifting to right and it will keep reducing gap until it reaches to 1.
 * Shell Sort Algorithm runs the gap to reduced , example bubble sort and insertion sort use 1 gap to insert element.
 * Shell Sort Goal is to reduced shifting and gap is also called Knuth Sequence.
 * To reduce shifting and swapping we can use Shell Sort
 * If we reduce shifting and swapping insertion and bubble sort will run faster
 * According to the gap value Time Complexity will be defined.
 * Gap is calculated using (3k-1)/2
 * Shell Sort In-place and unstable algorithm , Time Complexity O(n2) but it can perform much better than that.
 * Shell Sort will optimize insertion sort code below.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap ; i < array.length ; i++){
                int newElement = array[i];
                int j = i;
                while (j>=gap && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = newElement;
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array === " + array[i]);
        }
    }
}
