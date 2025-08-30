import java.util.Scanner;

public class QuotientRemainder {
    static int[] findRemainderAndQuotient(int num, int div) {
        int[] arr = new int[2];
        arr[0] = num % div;
        arr[1] = num / div;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.print("Enter number and divisor: ");
        int num = sc.nextInt(), div = sc.nextInt();
        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + res[1] + ", Remainder: " + res[0]);
    }
}
