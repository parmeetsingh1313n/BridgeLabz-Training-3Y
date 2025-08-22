import java.util.*;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n <= 0 || n >= 100) {
            System.out.println("not valid");
            return;
        }
        int i = 100;
        while (i >= 1) {
            if (i % n == 0)
                System.out.println(i);
            i--;
        }
    }
}
