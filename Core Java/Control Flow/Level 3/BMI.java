import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight in kg: ");
        double w = sc.nextDouble();
        System.out.print("height in cm: ");
        double h = sc.nextDouble();

        sc.close();

        double m = h / 100;
        double bmi = w / (m * m);

        System.out.println("bmi is " + bmi);

        if (bmi <= 18.4)
            System.out.println("underweight");
        else if (bmi <= 24.9)
            System.out.println("normal");
        else if (bmi <= 39.9)
            System.out.println("overweight");
        else
            System.out.println("obese");
    }
}
