import java.util.*;

public class CustomStringLength {
    static int findLength(String s) {
        int cnt = 0;
        try {
            while (true) {
                s.charAt(cnt);
                cnt++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            // reached end of string
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        sc.close();
                
        int custom = findLength(text);
        int builtIn = text.length();

        System.out.println("Custom length: " + custom);
        System.out.println("Built-in length: " + builtIn);
    }
}
