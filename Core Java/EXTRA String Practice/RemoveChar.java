import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter char to remove: ");
        char ch = sc.next().charAt(0);

        sc.close();

        String res = s.replace(ch + "", "");
        System.out.println("Modified: " + res);
    }
}
