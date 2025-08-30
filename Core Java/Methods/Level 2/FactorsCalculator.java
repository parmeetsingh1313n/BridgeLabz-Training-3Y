import java.util.*;

public class FactorsCalculator {
    static int[] getFactors(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) cnt++;
        }
        int[] f = new int[cnt];
        int k = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) f[k++] = i;
        }
        return f;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static int product(int[] arr) {
        int p = 1;
        for (int x : arr) p *= x;
        return p;
    }

    static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int x : arr) s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        sc.close();

        int[] f = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Sum of Squares: " + sumOfSquares(f));
        System.out.println("Product: " + product(f));
    }
}
