/*
    Order Agnostic Binary Search means it is given that the array is sorted but this is not given that it is in increasing order or in decreasing order... then this will be apply.
 */

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 2;
        orderAgnosticBinarySearch(arr2, target);
        orderAgnosticBinarySearch(arr1, target);
    }

    static void orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                System.out.println("Element found at index : " + mid);
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
    }
}
