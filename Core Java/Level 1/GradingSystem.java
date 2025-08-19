public class GradingSystem {
    public static void main(String[] args) {
        double marks = 85; // Example marks
        String grade;

        if (marks >= 90) {
            grade = "A";
        } 
        else if (marks >= 75 && marks < 90) {
            grade = "B";
        }
        else if(marks >= 50 && marks < 75) {
            grade = "C";
        }
        else {
            grade = "D";
        }

        System.out.println("The grade for marks " + marks + " is: " + grade);
    }
}
