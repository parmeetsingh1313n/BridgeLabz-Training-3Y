import java.util.Scanner;

public class UnitConverterPart2 {
    static double yardsToFeet(double yd) {
        return yd * 3;
    }

    static double feetToYards(double ft) {
        return ft * 0.333333;
    }

    static double metersToInches(double m) {
        return m * 39.3701;
    }

    static double inchesToMeters(double in) {
        return in * 0.0254;
    }

    static double inchesToCm(double in) {
        return in * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("yards: ");
        System.out.println("feet: " + yardsToFeet(sc.nextDouble()));

        System.out.print("feet: ");
        System.out.println("yards: " + feetToYards(sc.nextDouble()));

        System.out.print("meters: ");
        System.out.println("inches: " + metersToInches(sc.nextDouble()));

        System.out.print("inches: ");
        System.out.println("meters: " + inchesToMeters(sc.nextDouble()));

        System.out.print("inches (to cm): ");
        System.out.println("cm: " + inchesToCm(sc.nextDouble()));

        sc.close();
    }
}
