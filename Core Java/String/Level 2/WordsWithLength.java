import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsWithLength {
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

    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        sc.close();

        String[] words = customSplit(text);
        String[][] data = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
