import java.util.*;

public class IllegalArgDemo {
    static void causeError(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    static void handleError(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        sc.close();

        // causeError(text);
        handleError(text);
    }
}
