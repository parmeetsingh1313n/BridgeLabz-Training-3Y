import java.util.*;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        sc.close();

        int max = 10, idx = 0;
        int[] f = new int[max];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == max) {
                    max *= 2;
                    f = Arrays.copyOf(f, max);
                }
                f[idx++] = i;
            }
        }
        System.out.println("factors:");
        for (int i = 0; i < idx; i++)
            System.out.print(f[i] + " ");
    }
}
