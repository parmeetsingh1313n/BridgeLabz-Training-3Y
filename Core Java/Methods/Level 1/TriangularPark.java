import java.util.Scanner;

public class TriangularPark {
    static double calcRounds(double a, double b, double c) {
        double peri = a + b + c;
        return 5000 / peri;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides (m): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        sc.close();

        double rounds = calcRounds(a, b, c);
        System.out.println("Rounds needed: " + Math.ceil(rounds));
    }
}
