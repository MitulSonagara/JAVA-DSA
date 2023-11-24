/*
    If the matrix is fully sorted like...

        1  2  3  4
        5  6  7  8
        9  10 11 12
        13 14 15 16

    search for the mid element of the mid column... here mid element will be 6

    case 1 : If element == target , element found
    case 2 : If element > target , Ignore rows below the element
    case 3 : If element < target , Ignore rows above it

    After this if the last two rows are remaining.

    Like if we are searching for the element 3..
    target = 3
    mid column = column 1
        after applying 3 cases only first two rows will be remaining.
        - now check for target is available in mid column 
        - if not consider the four parts remaining which is [1], [3], [3,4], [7,8] and apply simple binary search on all this four parts.

    Time Complexity : O(logN+logM)
 */

public class Sorted2DArrayBS {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };
        int target = 25;
        search(matrix, target);
    }

    // Simple binary search in given row between given columns
    static void binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                System.out.println("Element found at index [" + row + "][" + mid + "]");
                return;
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        System.out.println("Element not found...");
        return;
    }

    static void search(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows == 1) {
            binarySearch(matrix, 0, 0, columns - 1, target);
            return;
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns / 2;

        // Run the loop till last two rows are remaining
        while (rStart < (rEnd - 1)) { // While this is true it will have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                System.out.println("Element found at index [" + mid + "][" + cMid + "]");
                return;
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows

        // Check if the target is in the mid column of that two rows
        if (matrix[rStart][cMid] == target) {
            System.out.println("Element found at index [" + rStart + "][" + cMid + "]");
            return;
        }
        if (matrix[rStart + 1][cMid] == target) { // coz only two rows are there so second element will be start+1
            System.out.println("Element found at index [" + (rStart + 1) + "][" + cMid + "]");
            return;
        }

        // Otherwise

        // Search in First part
        if (target <= matrix[rStart][cMid - 1]) {
            binarySearch(matrix, rStart, 0, cMid - 1, target);
            return;
        }
        // Search in Second part
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][columns - 1]) {
            binarySearch(matrix, rStart, cMid + 1, columns - 1, target);
            return;
        }
        // Search in Third part
        if (target <= matrix[rStart + 1][cMid - 1]) {
            binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
            return;
        }
        // Search in Fourth part
        if (target >= matrix[rStart + 1][cMid + 1]) {
            binarySearch(matrix, rStart + 1, cMid + 1, columns - 1, target);
            return;
        }
    }
}
