import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormats {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(d.format(f1));
        System.out.println(d.format(f2));
        System.out.println(d.format(f3));
    }
}
