package ham4;

import java.util.Scanner;

public class Ham4 {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        kiemtra(n, arr1);
        System.out.println(kiemtra(n, arr1));

    }

    public static int kiemtra(int x, int[] arr1) {
        int count = 0;
        int a;
        for (int i = 0; i < x - 1; i++) {
            if (arr1[i] < arr1[x - i -1]) {
                count++;
            } else {
                count--;
            }

        }
        if (count == x - 1) {
            a = 1;
        }
        if (count == -(x - 1)) {
            a = -1;
        } else {
            a = 0;
        }

        return a;
    }

}
