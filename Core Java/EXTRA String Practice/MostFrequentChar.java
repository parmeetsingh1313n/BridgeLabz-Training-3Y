import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        sc.close();

        int[] freq = new int[256];
        for (char ch : s.toCharArray())
            freq[ch]++;
        int max = 0;
        char ans = ' ';
        for (char ch : s.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                ans = ch;
            }
        }
        System.out.println("Most frequent char: " + ans);
    }
}
