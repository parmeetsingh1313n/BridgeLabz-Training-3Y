import java.util.Scanner;

public class Trigonometry {
    static double[] calcTrig(double angle) {
        double rad = Math.toRadians(angle);
        return new double[] { Math.sin(rad), Math.cos(rad), Math.tan(rad) };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double ang = sc.nextDouble();

        sc.close();

        double[] res = calcTrig(ang);
        System.out.println("sin: " + res[0] + ", cos: " + res[1] + ", tan: " + res[2]);
    }
}
