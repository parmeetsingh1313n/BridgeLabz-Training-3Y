import java.util.Scanner;

class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] d = new int[10];
        int ind = 0;
        while (n != 0 && ind < 10) {
            d[ind++] = n % 10;
            n /= 10;
        }
        int l = 0, sl = 0;
        for (int i = 0; i < ind; i++) {
            if (d[i] > l) {
                sl = l;
                l = d[i];
            }
            else if (d[i] > sl && d[i] != l)
                sl = d[i];
        }
        System.out.println("largest=" + l);
        System.out.println("2nd largest=" + sl);
    }
}
