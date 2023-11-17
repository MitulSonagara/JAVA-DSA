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
