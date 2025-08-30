import java.util.*;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        sc.close();

        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
            days[1] = 29;
        }

        System.out.println("Month: " + months[m - 1] + " " + y);
        for (int i = 1; i <= days[m - 1]; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }
}
