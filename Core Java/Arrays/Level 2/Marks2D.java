import java.util.*;

class Marks2D {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] m = new double[n][3];
        double[] per = new double[n];
        String[] g = new String[n];

        for (int i = 0; i < n; i++) {
            // take input of 3 subjects
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextDouble();
            }
            per[i] = (m[i][0] + m[i][1] + m[i][2]) / 3;
            double p = per[i];

            if (p >= 80)
                g[i] = "A";
            else if (p >= 70)
                g[i] = "B";
            else if (p >= 60)
                g[i] = "C";
            else if (p >= 50)
                g[i] = "D";
            else if (p >= 40)
                g[i] = "E";
            else
                g[i] = "R";
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(per[i] + " " + g[i]);
        }
    }
}
