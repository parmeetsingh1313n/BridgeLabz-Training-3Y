import java.util.*;

public class CharArrayCompare {
    static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.next();

        sc.close();
        char[] arr1 = getChars(s);
        char[] arr2 = s.toCharArray();

        System.out.println("Custom: " + Arrays.toString(arr1));
        System.out.println("Built-in: " + Arrays.toString(arr2));
        System.out.println("Match: " + compareArrays(arr1, arr2));
    }
}


