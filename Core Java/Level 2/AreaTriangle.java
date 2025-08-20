import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base in cm: ");
        double b = sc.nextDouble();
        System.out.print("enter height in cm: ");
        double h = sc.nextDouble();

        sc.close();

        double areaCm = 0.5 * b * h;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle:  " + areaIn + " and sq cm :- " + areaCm);
    }
}
