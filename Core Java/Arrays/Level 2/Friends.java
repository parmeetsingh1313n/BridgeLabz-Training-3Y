import java.util.*;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = { "Amar", "Akbar", "Anthony" };
        int[] age = new int[3];
        int[] ht = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("enter age of " + nm[i]);
            age[i] = sc.nextInt();
            System.out.println("enter ht of " + nm[i]);
            ht[i] = sc.nextInt();
        }
        sc.close();

        int ya = 0, ta = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[ya])
                ya = i;
            if (ht[i] > ht[ta])
                ta = i;
        }

        System.out.println("Youngest = " + nm[ya]);
        System.out.println("Tallest = " + nm[ta]);
    }
}
