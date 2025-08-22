import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        int yr = sc.nextInt();
        if (yr > 5) {
            double b = sal * 0.05;
            System.out.println("bonus is " + b);
        }
        else {
            System.out.println("no bonus");
        }
        sc.close();
    }
}
