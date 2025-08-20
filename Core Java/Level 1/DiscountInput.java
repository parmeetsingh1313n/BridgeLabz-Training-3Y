import java.util.Scanner;

public class DiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double dispercent = sc.nextDouble();
        double dis = fee * dispercent / 100;
        double finalFee = fee - dis;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + finalFee);
        sc.close();
    }
}
