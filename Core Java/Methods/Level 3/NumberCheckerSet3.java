import java.util.*;

public class NumberCheckerSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        long n = sc.nextLong();

        sc.close();
        
        int[] d = NumberChecker.toDigits(n);
        int[] r = NumberChecker.reverse(d);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Reversed: " + Arrays.toString(r));
        System.out.println("Equal? " + NumberChecker.arrEqual(d, r));
        System.out.println("Palindrome: " + NumberChecker.isPalindrome(n));
        System.out.println("Duck: " + NumberChecker.isDuck(d));
    }
}
