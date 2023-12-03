import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };// even numbers of elements
        int[] arr2 = { 1, 2, 3, 4, 5 };// odd numbers of elements

        reverse(arr1);
        reverse(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    } 

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
