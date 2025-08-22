import java.util.*;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res *= n;
        }
        System.out.println(res);
        sc.close();
    }
}
