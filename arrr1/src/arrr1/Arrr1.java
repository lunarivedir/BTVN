package arrr1;

import java.util.Scanner;

public class Arrr1 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        Scanner ex = new Scanner(System.in);
        int key = ex.nextInt();
        for (int i = 0; i < 10; i++) {
            if (key == arr[i]) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
