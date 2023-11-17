/*An Armstrong number is a special kind of number in math. It's a number that equals the sum of its digits, each raised to a power. For example, if you have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153. */

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int temp = a;
        int power = Integer.toString(a).length();
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = (sum) + (int) (Math.pow(rem, power));
            temp = temp / 10;
        }
        if (sum == a) {
            System.out.println("Entered number is armstrong number...");
        } else {
            System.out.println("Not an armstrong number!!!");
        }
        sc.close();
    }
}
