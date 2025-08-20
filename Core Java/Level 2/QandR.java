import java.util.Scanner;

public class QandR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("enter number2: ");
        int n2 = sc.nextInt();

        sc.close();

        int q = n1 / n2;
        int r = n1 % n2;

        System.out.println("The Quotient :- " + q + " and Reminder :- " + r + " of two number " + n1 + " and " + n2);
    }
}
