import java.util.Scanner;

public class SmallestLargest {
    static int[] findSmallestAndLargest(int a, int b, int c) {
        int[] arr = new int[2];
        arr[0] = Math.min(a, Math.min(b, c));
        arr[1] = Math.max(a, Math.max(b, c));
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] res = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + res[0] + ", Largest: " + res[1]);
    }
}
