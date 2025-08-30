import java.util.*;

public class FirstNonRepeat {
    static int strLen(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        }
        catch (Exception e) {
        }
        return c;
    }

    static char firstNonRepeatChar(String s) {
        int len = strLen(s);
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean repeat = false;
            for (int j = 0; j < len; j++) {
                if (i != j && s.charAt(j) == ch) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat)
                return ch;
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        sc.close();

        char res = firstNonRepeatChar(s);
        if (res != '\0')
            System.out.println("First non-repeat char: " + res);
        else
            System.out.println("No unique char found");
    }
}
