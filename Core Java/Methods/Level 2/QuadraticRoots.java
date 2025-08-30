import java.util.Scanner;

public class QuadraticRoots {
    static double[] roots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[] { r1, r2 };
        } else if (d == 0) {
            double r = -b / (2 * a);
            return new double[] { r };
        }
        return new double[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        sc.close();
        if (a == 0) {
            System.out.println("Not a quadratic (a=0)");
            return;
        }
        double[] r = roots(a, b, c);
        if (r.length == 2)
            System.out.println("Roots: " + r[0] + ", " + r[1]);
        else if (r.length == 1)
            System.out.println("Root: " + r[0]);
        else
            System.out.println("No real roots");
    }
}
