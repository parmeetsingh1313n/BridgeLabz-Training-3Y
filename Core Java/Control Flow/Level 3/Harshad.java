import java.util.*;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int s = 0;

        sc.close();

        while (t != 0) {
            s += t % 10;
            t = t / 10;
        }

        if (n % s == 0)
            System.out.println("Harshad");
        else
            System.out.println("Not Harshad");
    }
}
