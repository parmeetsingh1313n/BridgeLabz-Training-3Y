import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num: ");
        int n = sc.nextInt();

        sc.close();
        
        if (n <= 0) {
            System.out.println("not pos");
            return;
        }
        String[] arr = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                arr[i] = "FizzBuzz";
            else if (i % 3 == 0)
                arr[i] = "Fizz";
            else if (i % 5 == 0)
                arr[i] = "Buzz";
            else
                arr[i] = String.valueOf(i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("pos " + i + " = " + arr[i]);
        }
    }
}
