import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        sc.close();

        String res = "";
        for (char ch : s.toCharArray()) {
            if (!res.contains(ch + ""))
                res += ch;
        }
        System.out.println("After removing duplicates: " + res);
    }
}
