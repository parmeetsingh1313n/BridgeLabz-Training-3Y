import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("\nName\tAge\tEligible");
        for (int i = 0; i < 10; i++) {
            String status = (ages[i] >= 18) ? "Yes" : "No";
            System.out.println(names[i] + "\t" + ages[i] + "\t" + status);
        }
    }
}
