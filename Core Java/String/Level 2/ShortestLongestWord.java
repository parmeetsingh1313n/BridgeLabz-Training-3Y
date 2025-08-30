import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestLongestWord {
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

    static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (findLength(w) < findLength(shortest))
                shortest = w;
            if (findLength(w) > findLength(longest))
                longest = w;
        }
        return new String[] { shortest, longest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        sc.close();

        String[] words = customSplit(text);
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
