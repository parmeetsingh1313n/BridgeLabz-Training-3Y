import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        int y = sc.nextInt();
        if (y > 5) {
            System.out.println("bonus " + (sal * 0.05));
        }
        else {
            System.out.println("no bonus");
        }

        sc.close();
    }
}
