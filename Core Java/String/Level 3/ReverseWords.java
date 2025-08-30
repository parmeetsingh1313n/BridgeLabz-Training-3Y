import java.util.Scanner;

public class ReverseWords {
    static int strLen(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    static String reverseWords(String s) {
        String[] arr = s.split(" ");
        String out = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            out += arr[i];
            if (i != 0)
                out += " ";
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        sc.close();

        System.out.println(reverseWords(s));
    }
}
