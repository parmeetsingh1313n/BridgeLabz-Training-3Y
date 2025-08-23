import java.util.*;

class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        int i = 0;
        while (true) {
            System.out.print("enter num: ");
            double x = sc.nextDouble();
            if (x <= 0 || i == 10)
                break;
            arr[i++] = x;
        }
        sc.close();
        for (int j = 0; j < i; j++){
            sum += arr[j];
            }
        System.out.println("sum = " + sum);
    }
}
