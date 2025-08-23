import java.util.Scanner;

class DigitsDyn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int max = 10, ind = 0;
        int[] d = new int[max];
        while (n != 0) {
            if (ind == max) {
                max += 10;
                int[] t = new int[max];
                for (int j = 0; j < d.length; j++)
                    t[j] = d[j];
                d = t;
            }
            d[ind++] = n % 10;
            n /= 10;
        }
        int l = 0, sl = 0;
        for (int i = 0; i < ind; i++) {
            if (d[i] > l) {
                sl = l;
                l = d[i];
            } else if (d[i] > sl && d[i] != l)
                sl = d[i];
        }
        System.out.println("Largest=" + l);
        System.out.println("2nd Largest=" + sl);
    }
}
