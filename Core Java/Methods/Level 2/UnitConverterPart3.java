import java.util.Scanner;

public class UnitConverterPart3 {
    static double fToC(double f) {
        return (f - 32) * 5 / 9.0;
    }

    static double cToF(double c) {
        return (c * 9 / 5.0) + 32;
    }

    static double lbToKg(double lb) {
        return lb * 0.453592;
    }

    static double kgToLb(double kg) {
        return kg * 2.20462;
    }

    static double galToL(double g) {
        return g * 3.78541;
    }

    static double lToGal(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        System.out.println("Celsius: " + fToC(sc.nextDouble()));

        System.out.print("Celsius: ");
        System.out.println("Fahrenheit: " + cToF(sc.nextDouble()));

        System.out.print("Pounds: ");
        System.out.println("Kilograms: " + lbToKg(sc.nextDouble()));

        System.out.print("Kilograms: ");
        System.out.println("Pounds: " + kgToLb(sc.nextDouble()));

        System.out.print("Gallons: ");
        System.out.println("Liters: " + galToL(sc.nextDouble()));

        System.out.print("Liters: ");
        System.out.println("Gallons: " + lToGal(sc.nextDouble()));

        sc.close();
    }
}
