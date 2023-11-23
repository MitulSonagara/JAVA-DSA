/*
    Matrix is sorted in row wise and column wise manner...

        10 20 30 40
        15 25 35 45
        28 29 38 47
        33 34 40 50

    case 1 : If element == target , element found
    case 2 : If element < target , row++
    case 3 : If element > target , column--

    Time Complexity : O(N)
 */

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 38, 34, 50 }
        };
        int target = 37;
        search(arr, target);
    }

    static void search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                System.out.println("Element found at matrix[" + row + "][" + column + "].");
                return;
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        System.out.println("Element not found...");
        return;
    }
}
