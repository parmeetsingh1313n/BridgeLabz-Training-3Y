import java.util.Scanner;

public class PrimeCheck {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.close();

        System.out.println(isPrime(num) ? "Prime" : "Not Prime");
    }
}
