import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        sc.close();

        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("New word: ");
        String newWord = sc.nextLine();
        String res = s.replace(oldWord, newWord);
        System.out.println("Modified: " + res);
    }
}
