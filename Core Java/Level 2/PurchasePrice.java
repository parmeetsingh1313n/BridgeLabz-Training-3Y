import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter unit price: ");
        double up = sc.nextDouble();
        System.out.print("enter quantity: ");
        int qty = sc.nextInt();

        sc.close();

        double total = up * qty;
        System.out.println(
                "The total purchase price is INR " + total + " if the quantity " + qty + " and unit price is INR " + up);
    }
}
