import java.time.*;
import java.util.*;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date (yyyy-mm-dd):");
        String d = sc.next();
        LocalDate date = LocalDate.parse(d);

        LocalDate res = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + res);

        sc.close();
    }
}
