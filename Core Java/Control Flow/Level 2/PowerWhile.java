import java.util.*;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        int res = 1;
        int c = 0;
        while (c < p) {
            res *= n;
            c++;
        }
        System.out.println(res);
    }
}
