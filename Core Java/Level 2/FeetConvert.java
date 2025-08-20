import java.util.Scanner;

public class FeetConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter dist in feet: ");
        double f = sc.nextDouble();

        sc.close();

        double yd = f / 3;
        double mi = yd / 1760;

        System.out.println("The distance in yards is " + yd + " & the distance in mile :- " + mi);
    }
}
