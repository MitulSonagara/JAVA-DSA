/*
    Binary Search:

    Algorithm:(Assuming array is increasing order sorted.)
        -Find the middle element (mid)
        -If target < mid , search in left subarray.
            else search in right subarray.
        -If mid == target --> ans
        -If start > end ... element not found

    Time Complexity:
        Best Case : O(1) , Element found at the middle of the array.
        Worst Case : O(log2(n)) , Element found at the last subarray of size one.

 */

package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 2;
        binarySearch(arr, target);
    }

    static void binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2; // This may exceed the integer range in java
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {
                System.out.println("Element found at index : " + mid);
                return;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found...");
        return;
    }
}
