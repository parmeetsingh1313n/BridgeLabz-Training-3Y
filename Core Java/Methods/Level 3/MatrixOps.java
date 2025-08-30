import java.util.Random;
import java.util.Scanner;

public class MatrixOps {
    static int[][] randMat(int r, int c) {
        Random x = new Random();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = x.nextInt(10);
        return a;
    }

    static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] R = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                R[i][j] = A[i][j] + B[i][j];
        return R;
    }

    static int[][] sub(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] R = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                R[i][j] = A[i][j] - B[i][j];
        return R;
    }

    static int[][] mul(int[][] A, int[][] B) {
        int r = A.length, n = A[0].length, c = B[0].length;
        int[][] R = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                int s = 0;
                for (int k = 0; k < n; k++)
                    s += A[i][k] * B[k][j];
                R[i][j] = s;
            }
        return R;
    }

    static void print(int[][] M) {
        for (int[] row : M) {
            for (int v : row)
                System.out.printf("%4d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows Cols for A: ");
        int r = sc.nextInt(), c = sc.nextInt();
        System.out.print("Rows Cols for B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        sc.close();

        int[][] A = randMat(r, c);
        int[][] B = randMat(r2, c2);

        System.out.println("A:");
        print(A);
        System.out.println("B:");
        print(B);

        if (r == r2 && c == c2) {
            System.out.println("A+B:");
            print(add(A, B));
            System.out.println("A-B:");
            print(sub(A, B));
        } else {
            System.out.println("Add/Sub not possible (size mismatch)");
        }

        if (c == r2) {
            System.out.println("A*B:");
            print(mul(A, B));
        } else {
            System.out.println("Mul not possible (A.cols != B.rows)");
        }
    }
}
