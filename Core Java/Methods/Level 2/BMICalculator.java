import java.util.*;

public class BMICalculator {
    static double calcBmi(double wtKg, double htCm) {
        double m = htCm / 100.0;
        return wtKg / (m * m);
    }

    static String bmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        if (bmi < 25.0)
            return "Normal";
        if (bmi < 40.0)
            return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3]; // w, h, bmi
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " height (cm): ");
            arr[i][1] = sc.nextDouble();
            arr[i][2] = calcBmi(arr[i][0], arr[i][1]);
        }
        System.out.println("\n#  Weight(kg)  Height(cm)  BMI    Status");
        for (int i = 0; i < 10; i++) {
            double bmi = Math.round(arr[i][2] * 100.0) / 100.0;
            String st = bmiStatus(arr[i][2]);
            System.out.printf("%d  %10.2f  %10.2f  %5.2f  %s%n", (i + 1), arr[i][0], arr[i][1], bmi, st);
        }

        sc.close();
    }
}
