import java.util.*;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        if (n <= 0) {
            System.out.println("not positive");
            return;
        }
        int i = 1;
        while (i < n) {
            if (n % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
