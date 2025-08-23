import java.util.*;

class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.print("enter num: ");
            n[i] = sc.nextInt();
        }
        sc.close();
        for (int x : n) {
            if (x > 0) {
                if (x % 2 == 0)
                    System.out.println(x + " pos even");
                else
                    System.out.println(x + " pos odd");
            }
            else if (x < 0)
                System.out.println(x + " neg");
            else
                System.out.println("zero");
        }
        if (n[0] == n[n.length - 1])
            System.out.println("firstand last equal");
        else if (n[0] > n[n.length - 1])
            System.out.println("first bigger");
        else
            System.out.println("last bigger");
    }
}
