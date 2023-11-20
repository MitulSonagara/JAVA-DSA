/*
    Linear Search : 

    Time Complexity:
        Best Case : O(1) , When the element found at the 0th index of the array
        Wrost Case : O(n) , When element not found
        Average Case : O(n) 

 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 78, 9 };
        int ans = linearSearch(nums, 5);
        System.out.println(ans);
    }

    // Linear search : return the index if item found
    // if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // if target not found
        return -1;
    }
}
