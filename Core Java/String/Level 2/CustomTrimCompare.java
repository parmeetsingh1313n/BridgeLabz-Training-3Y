import java.util.*;

public class CustomTrimCompare {
    static String customTrim(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ')
            start++;
        while (end >= start && s.charAt(end) == ' ')
            end--;
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        sc.close();

        String custom = customTrim(text);
        String builtIn = text.trim();

        System.out.println("Custom trim: [" + custom + "]");
        System.out.println("Built-in trim: [" + builtIn + "]");
        System.out.println("Match: " + custom.equals(builtIn));
    }
}
