import java.util.*;

public class OtpGenerator {
    static int genOtp() {
        return 100000 + (int) (Math.random() * 900000);
    }

    static boolean allUnique(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = genOtp();
        System.out.println("OTPs: " + Arrays.toString(a));
        System.out.println("All unique: " + allUnique(a));
    }
}
