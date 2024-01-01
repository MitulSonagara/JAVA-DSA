package Sorting;
/*
    When given numbers from range 1 to n USE CYCLIC SORT.
        For example : 3 5 2 1 4
    The main formula is index = value-1

    Time Complexity : O(n)
 */

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 1, 3,6 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i]  -1 ;
            if (arr[i]!=arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}
