import java.util.*;

class CopyArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("rows: ");
        int r = sc.nextInt();

        System.out.print("cols: ");
        int c = sc.nextInt();

        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("val: ");
                m[i][j] = sc.nextInt();
            }
        }

        sc.close();
        
        int[] arr = new int[r * c];
        int k = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                arr[k++] = m[i][j];
            }
            System.out.println("1D arr:");
    }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
