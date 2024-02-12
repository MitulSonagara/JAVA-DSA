import java.util.Scanner;

public class Prime {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        isPrime(n);
        sc.close();
    }


    static void isPrime(int n) { 
        if (n <= 1) {
            System.out.println("neither prime nor not prime");
            return;
        } else {
            int count = 2;
            while (count * count <= n) {
                if (n % count == 0) {
                    System.out.println("not prime");
                    return;
                }
                count++;
            }
        }
        System.out.println("Prime");
        return;
    }
}
