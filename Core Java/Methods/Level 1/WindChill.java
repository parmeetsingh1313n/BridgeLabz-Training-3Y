import java.util.*;

public class WindChill {
    static double calcWindChill(double temp, double wind) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature and wind speed: ");
        double t = sc.nextDouble();
        double w = sc.nextDouble();

        sc.close();

        System.out.println("Wind Chill: " + calcWindChill(t, w));
    }
}
