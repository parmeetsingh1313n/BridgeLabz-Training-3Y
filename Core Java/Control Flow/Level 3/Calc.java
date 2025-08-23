import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();

        sc.close();

        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Divide by zero");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
