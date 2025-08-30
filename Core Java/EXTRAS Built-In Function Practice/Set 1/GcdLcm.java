import java.util.Scanner;

public class GcdLcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();

        sc.close();

        System.out.println("GCD: " + gcd(x, y));
        System.out.println("LCM: " + lcm(x, y));
    }
}
