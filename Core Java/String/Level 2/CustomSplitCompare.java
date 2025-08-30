import java.util.*;

public class CustomSplitCompare {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    static String[] customSplit(String s) {
        int len = findLength(s);
        
        List<String> words = new ArrayList<>();

        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            }
            else {
                if (!word.isEmpty()) {
                    words.add(word);
                    word = "";
                }
            }
        }
        if (!word.isEmpty())
            words.add(word);
        return words.toArray(new String[0]);
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        sc.close();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Custom split: " + Arrays.toString(custom));
        System.out.println("Built-in split: " + Arrays.toString(builtIn));
        System.out.println("Match: " + compareArrays(custom, builtIn));
    }
}
