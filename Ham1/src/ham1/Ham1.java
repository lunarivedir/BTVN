package ham1;

import java.util.Scanner;

public class Ham1 {

    

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        ham(n, arr1);
        System.out.println(ham(n, arr1));

    }
    public static boolean ham(int x, int[] arr1) {
        boolean check = true;
        
        for (int i = 0; i < x / 2; i++) {
            if (arr1[i] != arr1[x - i - 1]) {
                check = false;
                break;
            }
            
        }
        return check;
    }

}
