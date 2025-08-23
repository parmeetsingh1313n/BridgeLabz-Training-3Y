import java.util.*;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("physics marks: ");
        int p = sc.nextInt();
        System.out.print("chemistry marks: ");
        int c = sc.nextInt();
        System.out.print("maths marks: ");
        int m = sc.nextInt();

        sc.close();

        int t = p + c + m;
        double per = t / 3.0;
        System.out.println("avg: " + per);

        if (per >= 80)
            System.out.println("Grade A");
        else if (per >= 70)
            System.out.println("Grade B");
        else if (per >= 60)
            System.out.println("Grade C");
        else if (per >= 50)
            System.out.println("Grade D");
        else if (per >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");
    }
}
