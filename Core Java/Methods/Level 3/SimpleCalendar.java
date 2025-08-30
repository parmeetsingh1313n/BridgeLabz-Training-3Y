import java.util.Scanner;

public class SimpleCalendar {
    static String monthName(int m) {
        String[] names = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return names[m - 1];
    }

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static int daysInMonth(int m, int y) {
        int[] d = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (m == 2 && isLeap(y))
            return 29;
        return d[m - 1];
    }

    // Zeller (0=Sun)
    static int firstDay(int m, int y) {
        int month = m, year = y;
        int q = 1;
        if (month < 3) {
            month += 12;
            year--;
        }
        int K = year % 100;
        int J = year / 100;
        int h = (q + (13 * (month + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7; // 0=Sat
        int d = ((h + 6) % 7); // 0=Sun
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12) and year: ");
        int m = sc.nextInt(), y = sc.nextInt();
        int fd = firstDay(m, y);
        int days = daysInMonth(m, y);

        sc.close();

        System.out.println("\n" + monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < fd; i++)
            System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((fd + d) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
}
