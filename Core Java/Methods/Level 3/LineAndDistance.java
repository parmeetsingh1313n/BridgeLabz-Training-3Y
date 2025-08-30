import java.util.Scanner;

public class LineAndDistance {
    static double dist(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1, dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    static double[] line(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 y1 x2 y2: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();

        sc.close();

        System.out.printf("Distance: %.4f%n", dist(x1, y1, x2, y2));
        if (x2 == x1) {
            System.out.println("Vertical line: x = " + x1);
        } else {
            double[] mb = line(x1, y1, x2, y2);
            System.out.printf("Line: y = %.4fx + %.4f%n", mb[0], mb[1]);
        }
    }
}
