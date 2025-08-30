import java.util.Arrays;
import java.util.Scanner;

public class FactorsOps {
    static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                f[k++] = i;
        return f;
    }

    static int greatest(int[] f) {
        return f[f.length - 2];
    } // ignoring n itself; greatest proper

    static long sum(int[] f) {
        long s = 0;
        for (int x : f)
            s += x;
        return s;
    }

    static long product(int[] f) {
        long p = 1;
        for (int x : f)
            p *= x;
        return p;
    }

    static long productOfCubes(int[] f) {
        long p = 1;
        for (int x : f)
            p *= (long) Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        sc.close();

        int[] f = factors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest factor: " + (f.length > 1 ? greatest(f) : n));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of cubes: " + productOfCubes(f));
    }
}
