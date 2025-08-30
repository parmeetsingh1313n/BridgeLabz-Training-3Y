import java.util.Scanner;

public class NumberCheckerSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        long n = sc.nextLong();

        sc.close();

        int[] d = NumberChecker.toDigits(n);
        System.out.println("Sum of digits: " + NumberChecker.sumDigits(d));
        System.out.println("Sum of squares: " + NumberChecker.sumSquares(d));
        System.out.println("Harshad: " + NumberChecker.isHarshad(n));
        int[][] freq = NumberChecker.digitFreq(n);
        System.out.println("Digit  Freq");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + "      " + freq[i][1]);
        }
    }
}
