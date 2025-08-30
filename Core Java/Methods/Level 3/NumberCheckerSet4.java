import java.util.Scanner;

public class NumberCheckerSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        long n = sc.nextLong();

        sc.close();

        System.out.println("Prime: " + NumberChecker.isPrime(n));
        System.out.println("Neon: " + NumberChecker.isNeon((int) n));
        System.out.println("Spy: " + NumberChecker.isSpy(n));
        System.out.println("Automorphic: " + NumberChecker.isAutomorphic(n));
        System.out.println("Buzz: " + NumberChecker.isBuzz(n));
        int ni = (int) n;
        if (ni > 0) {
            System.out.println("Perfect: " + NumberChecker.isPerfect(ni));
            System.out.println("Abundant: " + NumberChecker.isAbundant(ni));
            System.out.println("Deficient: " + NumberChecker.isDeficient(ni));
            System.out.println("Strong: " + NumberChecker.isStrong(ni));
        } else {
            System.out.println("Perfect/Abundant/Deficient/Strong: only for positive ints");
        }
    }
}
