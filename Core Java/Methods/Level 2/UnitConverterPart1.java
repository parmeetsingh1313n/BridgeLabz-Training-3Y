import java.util.*;

public class UnitConverterPart1 {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    static double metersToFeet(double m) {
        return m * 3.28084;
    }

    static double feetToMeters(double f) {
        return f * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = sc.nextDouble();
        System.out.println("In miles: " + kmToMiles(km));

        System.out.print("Enter miles: ");
        double mi = sc.nextDouble();
        System.out.println("In km: " + milesToKm(mi));

        System.out.print("Enter meters: ");
        double m = sc.nextDouble();
        System.out.println("In feet: " + metersToFeet(m));

        System.out.print("Enter feet: ");
        double ft = sc.nextDouble();
        System.out.println("In meters: " + feetToMeters(ft));

        sc.close();
    }
}
