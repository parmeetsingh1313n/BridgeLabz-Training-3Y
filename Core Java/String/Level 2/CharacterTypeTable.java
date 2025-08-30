import java.util.*;

public class CharacterTypeTable {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        sc.close();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (isAlphabet(ch)) {
                if (isVowel(ch))
                    System.out.println(ch + "\tVowel");
                else
                    System.out.println(ch + "\tConsonant");
            }
            else {
                System.out.println(ch + "\tNot a Letter");
            }
        }
    }
}
