import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = 0, n;
        while (true) {
            n = sc.nextDouble();
            if (n == 0)
                break;
            t += n;
        }
        System.out.println("total is " + t);

        sc.close();
    }
}
