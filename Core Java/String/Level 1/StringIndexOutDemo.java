import java.util.*;

public class StringIndexOutDemo {
    static void causeError(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    static void handleError(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught SIBE");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        sc.close();

        // causeError(text); // Uncomment to see abrupt stop
        handleError(text);
    }
}
