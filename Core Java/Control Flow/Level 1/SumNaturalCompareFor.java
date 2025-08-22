import java.util.Scanner;

public class SumNaturalCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int s1 = 0;
            for (int i = 1; i <= n; i++)
                s1 += i;
            int s2 = n * (n + 1) / 2;
            System.out.println("sum with for = " + s1 + ", sum with formula = " + s2);
        } 
        else {
            System.out.println("not a natural number");
        }
        sc.close();
    }
}
