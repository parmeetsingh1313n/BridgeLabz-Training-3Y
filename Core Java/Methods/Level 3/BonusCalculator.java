import java.util.*;

public class BonusCalculator {
    static double[][] genSalaryAndYears(int n) {
        Random r = new Random();
        double[][] a = new double[n][2]; // sal, yrs
        for (int i = 0; i < n; i++) {
            a[i][0] = 10000 + r.nextInt(90000); // 5-digit-ish
            a[i][1] = 1 + r.nextInt(15);
        }
        return a;
    }

    static double[][] computeNew(double[][] old) {
        double[][] b = new double[old.length][2]; // newSal, bonus
        for (int i = 0; i < old.length; i++) {
            double sal = old[i][0], yrs = old[i][1];
            double rate = yrs > 5 ? 0.05 : 0.02;
            double bonus = sal * rate;
            b[i][0] = sal + bonus;
            b[i][1] = bonus;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] base = genSalaryAndYears(n);
        double[][] upd = computeNew(base);
        double sumOld = 0, sumNew = 0, totBonus = 0;

        System.out.println("Emp   OldSalary   Years   NewSalary   Bonus");
        for (int i = 0; i < n; i++) {
            sumOld += base[i][0];
            sumNew += upd[i][0];
            totBonus += upd[i][1];
            System.out.printf("%-5d %-10.2f %-6.0f %-10.2f %-10.2f%n", (i + 1), base[i][0], base[i][1], upd[i][0],
                    upd[i][1]);
        }
        System.out.printf("Total Old: %.2f | Total New: %.2f | Total Bonus: %.2f%n", sumOld, sumNew, totBonus);
    }
}
