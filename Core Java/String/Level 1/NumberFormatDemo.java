import java.util.*;

public class NumberFormatDemo {
    static void causeError(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    static void handleError(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }
        catch (RuntimeException e) {
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
