import java.util.*;

public class FootballHeightsStats {
    static int sum(int[] a){
        int s=0;
        for(int x:a) s+=x;
        return s;
    }
    static double mean(int[] a){
        return sum(a)*1.0/a.length;
    }
    static int min(int[] a){
        int m=a[0];
        for(int x:a) if(x<m) m=x;
        return m;
    }
    static int max(int[] a){
        int m=a[0];
        for(int x:a) if(x>m) m=x;
        return m;
    }

    public static void main(String[] args){
        Random rnd=new Random();
        int[] h=new int[11];
        for (int i = 0; i < 11; i++) {
            h[i] = 150 + rnd.nextInt(101);
        }
        System.out.println("Heights: "+Arrays.toString(h));
        System.out.println("Shortest: "+min(h)+" cm");
        System.out.println("Tallest: "+max(h)+" cm");
        System.out.printf("Mean: %.2f cm%n", mean(h));
    }
}
