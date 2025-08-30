import java.util.*;

public class MaxOfThree {
    static int max(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

        sc.close();
        
        System.out.println("Max is: " + max(x, y, z));
    }
}
