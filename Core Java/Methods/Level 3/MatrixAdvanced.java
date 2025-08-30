import java.util.Random;
import java.util.Scanner;

public class MatrixAdvanced {
    static double[][] randMat(int n, int m) {
        Random r = new Random();
        double[][] a = new double[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = r.nextInt(9) + 1;
        return a;
    }

    static double[][] trans(double[][] A) {
        int r = A.length, c = A[0].length;
        double[][] T = new double[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                T[j][i] = A[i][j];
        return T;
    }

    static double det2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        // assumes 2x2
    }

    static double det3(double[][] m) {
        double a = m[0][0], b = m[0][1], c = m[0][2];
        double d = m[1][0], e = m[1][1], f = m[1][2];
        double g = m[2][0], h = m[2][1], i = m[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    static double[][] inv2(double[][] m) {
        double d = det2(m);
        if (Math.abs(d) < 1e-9)
            return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / d;
        inv[0][1] = -m[0][1] / d;
        inv[1][0] = -m[1][0] / d;
        inv[1][1] = m[0][0] / d;
        return inv;
    }

    static double[][] inv3(double[][] m) {
        double d = det3(m);
        if (Math.abs(d) < 1e-9)
            return null;
        double[][] cof = new double[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                double[][] sub = new double[2][2];
                int rr = 0, cc;
                for (int i = 0; i < 3; i++) {
                    if (i == r)
                        continue;
                    cc = 0;
                    for (int j = 0; j < 3; j++) {
                        if (j == c)
                            continue;
                        sub[rr][cc++] = m[i][j];
                    }
                    rr++;
                }
                double minor = det2(sub);
                cof[r][c] = ((r + c) % 2 == 0 ? 1 : -1) * minor;
            }
        }
        double[][] adj = trans(cof);
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / d;
        return inv;
    }

    static void print(double[][] M) {
        for (double[] row : M) {
            for (double v : row)
                System.out.printf("%8.3f", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size (2 or 3): ");
        int n = sc.nextInt();

        sc.close();

        if (n == 2) {
            double[][] A = randMat(2, 2);
            System.out.println("A:");
            print(A);
            System.out.println("Transpose:");
            print(trans(A));
            System.out.println("Det: " + det2(A));
            double[][] inv = inv2(A);
            if (inv == null)
                System.out.println("Inverse: Not invertible");
            else {
                System.out.println("Inverse:");
                print(inv);
            }
        }

        else if (n == 3) {
            double[][] A = randMat(3, 3);
            System.out.println("A:");
            print(A);
            System.out.println("Transpose:");
            print(trans(A));
            System.out.println("Det: " + det3(A));
            double[][] inv = inv3(A);
            if (inv == null)
                System.out.println("Inverse: Not invertible");
            else {
                System.out.println("Inverse:");
                print(inv);
            }
        } else {
            System.out.println("Only 2 or 3 supported");
        }
    }
}
