import java.util.*;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n <= 0 || n >= 100) {
            System.out.println("not valid");
            return;
        }
        for (int i = 100; i >= 1; i--) {
            if (i % n == 0)
                System.out.println(i);
        }
    }
}
