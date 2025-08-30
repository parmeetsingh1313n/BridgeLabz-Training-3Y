import java.util.Scanner;

public class TempConvert {
    static double toC(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        System.out.println("F to C: " + toC(f));
        System.out.println("C to F: " + toF(c));
    }
}
