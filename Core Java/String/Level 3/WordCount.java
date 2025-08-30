import java.util.*;

public class WordCount {
    static int strLen(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        }
        catch (Exception e) {
        }
        return i;
    }

    static int countWords(String s) {
        int len = strLen(s), c = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ' && !inWord) {
                c++;
                inWord = true;
            }
            else if (s.charAt(i) == ' ') {
                inWord = false;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");

        sc.close();

        String s = sc.nextLine();
        System.out.println("Word count: " + countWords(s));
    }
}
