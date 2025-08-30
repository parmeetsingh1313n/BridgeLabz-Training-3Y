import java.util.Scanner;

public class BasicCalc {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static double div(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        sc.close();

        System.out.println("Add: " + add(a, b));
        System.out.println("Sub: " + sub(a, b));
        System.out.println("Mul: " + mul(a, b));
        System.out.println("Div: " + div(a, b));
    }
}
