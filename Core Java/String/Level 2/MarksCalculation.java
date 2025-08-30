import java.util.*;

public class MarksCalculation {
    static String grade(double percentage) {
        if (percentage >= 90)
            return "A+";
        if (percentage >= 75)
            return "A";
        if (percentage >= 60)
            return "B";
        if (percentage >= 40)
            return "C";
        return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        String[] sub = { "Physics", "Chemistry", "Maths" };

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks in " + sub[i] + ": ");
            marks[i] = sc.nextInt();
        }

        sc.close();

        int total = marks[0] + marks[1] + marks[2];
        double percentage = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade(percentage));
    }
}
