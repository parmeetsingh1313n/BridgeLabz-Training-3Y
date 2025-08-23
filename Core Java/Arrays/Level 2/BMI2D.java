import java.util.*;

class BMI2D {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] p = new double[n][3];
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("wt?");
            double w = sc.nextDouble();
            System.out.println("ht?");
            double h = sc.nextDouble();
            double bmi = w / (h * h);
            p[i][0] = w;
            p[i][1] = h;
            p[i][2] = bmi;
            if (bmi <= 18.4)
                st[i] = "Under";
            else if (bmi <= 24.9)
                st[i] = "Normal";
            else if (bmi <= 39.9)
                st[i] = "Over";
            else
                st[i] = "Obese";
        }

        sc.close();
        
        for (int i = 0; i < n; i++) {
            System.out.println(p[i][0] + " " + p[i][1] + " " + p[i][2] + " " + st[i]);
        }
    }
}
