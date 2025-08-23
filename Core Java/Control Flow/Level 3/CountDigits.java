import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        sc.close();

        while (n != 0) {
            n = n / 10;
            c++;
        }

        System.out.println("Digits: " + c);
    }
}
