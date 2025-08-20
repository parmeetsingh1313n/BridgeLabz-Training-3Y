import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        double a = sc.nextDouble();
        System.out.print("enter b: ");
        double b = sc.nextDouble();
        System.out.print("enter c: ");
        double c = sc.nextDouble();

        sc.close();

        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;

        System.out.println("The results of Int Operations are " + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
    }
}
        