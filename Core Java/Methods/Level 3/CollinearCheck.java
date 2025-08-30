import java.util.Scanner;

public class CollinearCheck {
    static boolean collinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double abY = y2 - y1, abX = x2 - x1;
        double bcY = y3 - y2, bcX = x3 - x2;
        double acY = y3 - y1, acX = x3 - x1;
        if (abX == 0 && bcX == 0 && acX == 0)
            return true;
        if (abX == 0 || bcX == 0 || acX == 0)
            return false;
        double s1 = abY / abX, s2 = bcY / bcX, s3 = acY / acX;
        return Math.abs(s1 - s2) < 1e-9 && Math.abs(s2 - s3) < 1e-9;
    }

    static boolean collinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 y1 x2 y2 x3 y3: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble(),
                x3 = sc.nextDouble(), y3 = sc.nextDouble();

        sc.close();

        System.out.println("Slope check: " + collinearSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Area check: " + collinearArea(x1, y1, x2, y2, x3, y3));
    }
}
