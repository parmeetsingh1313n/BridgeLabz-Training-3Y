import java.util.*;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num: ");
        int n = sc.nextInt();

        sc.close();

        if (n <= 0) {
            System.out.println("not natural");
            return;
        }
        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];
        int oddInd = 0, evenInd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even[evenInd++] = i;
            else
                odd[oddInd++] = i;
        }
        System.out.println("odd nums:");
        for (int i = 0; i < oddInd; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("-----------------------------------");

        System.out.println("even nums:");
        for (int i = 0; i < evenInd; i++) {
            System.out.print(even[i] + " ");
        }

        
    }
}
