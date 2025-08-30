import java.time.*;
import java.util.*;

public class DateCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date (yyyy-mm-dd):");
        LocalDate d1 = LocalDate.parse(sc.next());
        System.out.println("Enter second date (yyyy-mm-dd):");
        LocalDate d2 = LocalDate.parse(sc.next());

        sc.close();

        if (d1.isBefore(d2))
            System.out.println("First date is before second");
        else if (d1.isAfter(d2))
            System.out.println("First date is after second");
        else
            System.out.println("Both dates are same");
    }
}
