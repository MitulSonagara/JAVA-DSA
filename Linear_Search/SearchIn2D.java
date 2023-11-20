package Linear_Search;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 7, 8 },
                { 10, 2, 21, 3, 5, 5 },
                { 1, 5, 2, 6 }
        };
        int target = 0;
        search(arr, target);
    }

    static void search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println("Element found at arr[" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("Element not found");
    }
}
