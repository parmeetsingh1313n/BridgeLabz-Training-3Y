import java.util.*;

class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            System.out.print("enter age: ");
            age[i] = sc.nextInt();
        }
        sc.close();
        for (int x : age) {
            if (x < 0) System.out.println("invalid age");
            else if (x >= 18) System.out.println("age " + x + " can vote");
            else System.out.println("age " + x + " cant vote");
        }
    }
}
