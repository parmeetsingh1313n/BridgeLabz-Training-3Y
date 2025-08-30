import java.util.Scanner;

public class CheckNumber {
    static int checkNum(int n) {
        if (n > 0)
            return 1;
        if (n < 0)
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        sc.close();

        int res = checkNum(n);
        if (res == 1)
            System.out.println("Positive");
        else if (res == -1)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
