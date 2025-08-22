import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("not a natural no");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " even");
            else
                System.out.println(i + " odd");
        }
    }
}
