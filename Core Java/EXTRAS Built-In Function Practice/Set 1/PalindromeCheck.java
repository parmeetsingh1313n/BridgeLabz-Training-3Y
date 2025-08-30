import java.util.*;

public class PalindromeCheck {
    static boolean check(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        sc.close();

        System.out.println(check(str) ? "Palindrome" : "Not Palindrome");
    }
}
