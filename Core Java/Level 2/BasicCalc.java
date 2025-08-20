import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        double n1 = sc.nextDouble();
        System.out.print("enter num2: ");
        double n2 = sc.nextDouble();

        sc.close();

        double add = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        double div = n1 / n2;

        System.out.println("The addition, subtraction, multiplication and division of " + n1 + " and " + n2 + " is " + add + ", " + sub + ", " + mul + " and " + div);
    }
}
