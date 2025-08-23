import java.util.*;

class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sal = new double[10], yr = new double[10];
        double[] nsal = new double[10], bn = new double[10];
        double ts = 0, tn = 0, tb = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("salary?");
            double s = sc.nextDouble();
            System.out.println("yrs?");
            double y = sc.nextDouble();
            if (s < 0 || y < 0) {
                i--;
                continue;
            }
            sal[i] = s;
            yr[i] = y;
        }

        sc.close();
        for (int i = 0; i < 10; i++) {
            bn[i] = (yr[i] > 5 ? sal[i] * 0.05 : sal[i] * 0.02);
            nsal[i] = sal[i] + bn[i];
            tb += bn[i];
            ts += sal[i];
            tn += nsal[i];
        }
        System.out.println("total bonus=" + tb);
        System.out.println("old salary=" + ts);
        System.out.println("new salary=" + tn);
    }
}
