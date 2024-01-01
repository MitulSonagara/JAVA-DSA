package Sorting;
/* 
    Bubble Sort :
        Also known as sinking sort or exchange sort.

    Time Complexity : 
        Best Case : O(N) , Array is sorted
        Worst Case : O(N^2) , Array is sorted in opposite order

    This is a stable sorting algorithm means the original order of the same elements will be maintained.
 */
 
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run outer loop n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // For each step, max item will come at the last respective index 
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // If there is no swapping for particular pass or value of i...
            // this means array is sorted and stop the program
            if (!swapped) {
                break;
            }
        }

    }
}
