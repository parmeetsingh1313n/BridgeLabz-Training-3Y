import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (m): ");
        double h = sc.nextDouble();
        
        sc.close();

        double bmi = w / (h * h);
        System.out.println("BMI: " + Math.round(bmi * 100.0) / 100.0);
        
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 24.9)
            System.out.println("Normal");
        else if (bmi < 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
