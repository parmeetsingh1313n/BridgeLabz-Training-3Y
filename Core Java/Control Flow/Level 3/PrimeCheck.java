import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;

        if (n <= 1) {
            flag = false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        sc.close();
        
        if (flag)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
