package Sorting;
/*
    Insertion Sort : Select the element and place it at its correct position.

    Time Complexity : 
        Best Case : O(n) //Array is already sorted.
        Worst case : O(n^2) //Array is sorted in reverse order.

    Why to use it :
        -Adaptive : Steps get reduced if array is sorted. Number of swaps reduced as compare to bubble sort.
        -This is stable sorting algo
        -Used for smaller values of N. Works good when array is partially sorted.
        -It takes part in hybrid sorting algorithms
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
