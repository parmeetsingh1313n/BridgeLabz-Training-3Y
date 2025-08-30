import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        sc.close();

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);
        }
        System.out.println("Toggled: " + sb);
    }
}
