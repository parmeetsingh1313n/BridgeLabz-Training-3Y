import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        if (n <= 0) {
            System.out.println("not positive");
            return;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
