package Patterns;
/*
    How to approach for any pattern : 
        1. Number of lines = Number of rows = Number of outer loop will run
        2. Identify for every row number: How many cols are there and type of element in col
        3. What do you need to print (try to find formula relating rows and cols)
 */

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(4);
        System.out.println();
        pattern11(5);
        System.out.println();
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need a new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need a new line
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // When one row is printed, we need a new line
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= ((2 * n) - 1); row++) {
            int c;
            if (row > n) {
                c = n - (row - n);
            } else {
                c = row;
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= ((2 * n) - 1); row++) {
            int c, s;
            c = row > n ? 2 * n - row : row;
            s = row > n ? row - n : n - row;
            for (int space = 1; space <= s; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int s = n - row;
            for (int space = 1; space <= s; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {

                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row > n ? 2 * n - row : row;
            int s = row > n ? row - n : n - row;
            for (int space = 1; space <= s; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int e = n - Math.min(Math.min(row - 1, col - 1), Math.min(2 * n - 1 - row, 2 * n - 1 - col));
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row > n ? 2 * n - row : row;
            int s = row > n ? 2 * row - 2 * n : 2 * n - 2 * row;
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= s; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int c, s;
            c = row > n ? 2 * n - row : row;
            s = row > n ? row - n : n - row;

            for (int space = 1; space <= s; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= c; col++) {
                if (col == 1 || col == c ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }

            System.out.println();
        }
    }
}
