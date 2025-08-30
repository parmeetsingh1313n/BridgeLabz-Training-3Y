import java.util.Scanner;

public class YoungestTallestFinder {
    static int idxOfMin(int[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[idx])
                idx = i;
        return idx;
    }

    static int idxOfMax(int[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[idx])
                idx = i;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] age = new int[3];
        int[] ht = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " age: ");
            age[i] = sc.nextInt();
            System.out.print(names[i] + " height (cm): ");
            ht[i] = sc.nextInt();
        }

        int y = idxOfMin(age);
        int t = idxOfMax(ht);
        System.out.println("Youngest: " + names[y] + " (" + age[y] + ")");
        System.out.println("Tallest: " + names[t] + " (" + ht[t] + " cm)");

        sc.close();
    }
}
