import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.err.println("Enter the operator or press x for close : ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number : ");
                int a = sc.nextInt();
                System.out.print("Enter second number : ");
                int b = sc.nextInt();
                if (op == '+') {
                    System.out.println("The sum is : " + (a + b)); 
                } else if (op == '-') {
                    System.out.println("The subtraction is : " + (a - b)); 
                } else if (op == '*') {
                    System.out.println("The multiplication is : " + (a * b));
                } else if (op == '/') {
                    System.out.println("The division is : " + (a / b));
                } else if (op == '%') {
                    System.out.println("The remainder is : " + (a % b));
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Please enter valid operator!!!");
            }
        }
        sc.close();
    }
}
