import java.util.*;

public class PalindromeCheck {
    static boolean isPal(String s) {
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
        System.out.print("Enter text: ");
        sc.close();
        
        String s = sc.nextLine();
        System.out.println(isPal(s) ? "Palindrome" : "Not Palindrome");
    }
}
