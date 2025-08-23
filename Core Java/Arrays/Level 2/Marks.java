import java.util.*;

class Marks {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] phy = new double[n], che = new double[n], mat = new double[n], per = new double[n];
        String[] g = new String[n];
        for (int i = 0; i < n; i++) {
            phy[i] = sc.nextDouble();
            che[i] = sc.nextDouble();
            mat[i] = sc.nextDouble();
            per[i] = (phy[i] + che[i] + mat[i]) / 3;
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
        for (int i = 0; i < n; i++) {
            System.out.println(per[i] + " " + g[i]);
        }
        sc.close();
    }
}
