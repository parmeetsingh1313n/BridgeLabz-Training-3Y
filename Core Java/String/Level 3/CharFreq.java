import java.util.*;

public class CharFreq {
    static int strLen(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    static void freq(String s) {
        int len = strLen(s);
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            int c = 0;
            boolean seen = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    seen = true;
                    break;
                }
            }
            if (seen)
                continue;
            for (int j = 0; j < len; j++) {
                if (s.charAt(j) == ch)
                    c++;
            }
            System.out.println(ch + " -> " + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        sc.close();
        freq(s);
    }
}
