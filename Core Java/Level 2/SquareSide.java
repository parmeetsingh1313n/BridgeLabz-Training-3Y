import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter perimeter: ");
        double p = sc.nextDouble();
        double s = p / 4;
        System.out.println("The length of the side is " + s + "& perimeter is " + p);

        sc.close();
    }
}
