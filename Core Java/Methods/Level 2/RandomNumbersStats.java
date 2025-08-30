import java.util.*;

public class RandomNumbersStats {
    static int[] generate4DigitRandomArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = 1000 + (int) (Math.random() * 9000);
        }
        return a;
    }

    static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int x : arr) {
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            sum += x;
        }
        double avg = sum * 1.0 / arr.length;
        return new double[] { avg, min, max };
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(nums));
        double[] out = findAverageMinMax(nums);
        System.out.println("Average: " + out[0]);
        System.out.println("Min: " + (int) out[1]);
        System.out.println("Max: " + (int) out[2]);
    }
}
