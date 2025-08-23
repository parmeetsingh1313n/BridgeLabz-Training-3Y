import java.util.*;

class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] h = new double[11];
        double sum = 0;
        for (int i = 0; i < h.length; i++) {
            System.out.print("enter height: ");
            h[i] = sc.nextDouble();
            sum += h[i];
        }
        sc.close();

        System.out.println("mean = " + (sum / h.length));
    }
}
