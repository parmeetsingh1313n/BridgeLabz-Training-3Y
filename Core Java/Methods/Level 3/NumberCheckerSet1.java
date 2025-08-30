import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        long n = sc.nextLong();

        sc.close();

        int[] d = NumberChecker.toDigits(n);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Duck: " + NumberChecker.isDuck(d));
        System.out.println("Armstrong: " + NumberChecker.isArmstrong(d));
        int[] big = NumberChecker.largestTwo(d);
        int[] sml = NumberChecker.smallestTwo(d);
        System.out.println("Largest/Second: " + big[0] + ", " + big[1]);
        System.out.println("Smallest/Second: " + sml[0] + ", " + sml[1]);
    }
}
