import java.util.Scanner;

public class NumberCheckComparison {
    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 1 if a>b, 0 if equal, -1 if a<b
    static int compare(int a, int b) {
        if (a > b)
            return 1;
        if (a == b)
            return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            if (isPositive(x)) {
                System.out.println(x + " is positive, " + (isEven(x) ? "even" : "odd"));
            } else {
                System.out.println(x + " is negative");
            }
        }

        sc.close();

        int cmp = compare(arr[0], arr[arr.length - 1]);
        if (cmp == 0)
            System.out.println("First and last are equal");
        else if (cmp > 0)
            System.out.println("First is greater than last");
        else
            System.out.println("First is less than last");
    }
}
