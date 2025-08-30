import java.util.Random;
import java.util.Scanner;

public class Scorecard {
    static int[][] genPCM(int n) {
        Random r = new Random();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = 40 + r.nextInt(61);
            a[i][1] = 40 + r.nextInt(61);
            a[i][2] = 40 + r.nextInt(61);
        }
        return a;
    }

    static double[] calcRow(int p, int c, int m) {
        int total = p + c + m;
        double avg = total / 3.0;
        double percent = (total / 300.0) * 100.0;
        percent = Math.round(percent * 100.0) / 100.0;
        return new double[] { total, avg, percent };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Students: ");
        int n = sc.nextInt();

        sc.close();

        int[][] s = genPCM(n);
        System.out.println("No\tP\tC\tM\tTotal\tAvg\t%\t");
        for (int i = 0; i < n; i++) {
            double[] r = calcRow(s[i][0], s[i][1], s[i][2]);
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%.2f%n",
                    (i + 1), s[i][0], s[i][1], s[i][2], (int) r[0], r[1], r[2]);
        }
    }
}
