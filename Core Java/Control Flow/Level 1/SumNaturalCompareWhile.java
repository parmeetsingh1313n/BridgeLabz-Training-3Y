import java.util.Scanner;

public class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int s1 = 0, i = 1;
            while (i <= n) {
                s1 += i;
                i++;
            }
            int s2 = n * (n + 1) / 2;
            System.out.println("sum with while = " + s1 + ", sum with formula = " + s2);
        }
        else {
            System.out.println("not a natural number");
        }
        sc.close();
    }
}
