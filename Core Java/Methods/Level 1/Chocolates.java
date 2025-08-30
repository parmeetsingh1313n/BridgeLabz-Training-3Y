import java.util.Scanner;

public class Chocolates {
    static int[] findRemainderAndQuotient(int num, int div) {
        int[] arr = new int[2];
        arr[0] = num % div;
        arr[1] = num / div;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int n = sc.nextInt(), m = sc.nextInt();

        sc.close();

        int[] res = findRemainderAndQuotient(n, m);
        System.out.println("Each child gets: " + res[1] + ", Remaining: " + res[0]);
    }
}
