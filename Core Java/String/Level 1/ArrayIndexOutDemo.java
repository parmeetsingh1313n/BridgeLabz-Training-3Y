import java.util.*;

public class ArrayIndexOutDemo {
    static void causeError(String[] arr) {
        System.out.println(arr[arr.length]); // invalid ind
    }

    static void handleError(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        sc.close();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // causeError(arr);
        handleError(arr);
    }
}
