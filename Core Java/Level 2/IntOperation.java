import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
        System.out.print("enter c: ");
        int c = sc.nextInt();

        sc.close();

        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;

        System.out.println("The results of Int operations :- " + r1 + ", " + r2 + ", " + r3 + ", & " + r4);
    }
}
