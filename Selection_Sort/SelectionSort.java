/*
    Selection Sort : Select the smallest or largest element and place it at its correct position.

    Time Complexity : 
        Worst Case : O(N^2)
        Best Case : O(N^2)
    
    This is non stable sorting algorithm which means the original order of the same elements will not be maintained.

    It performs well on small lists.
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 8, 6, 2, 4, -3 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with the correct index.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            // swap maxIndex with last
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
