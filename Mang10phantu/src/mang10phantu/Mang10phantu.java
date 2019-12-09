package mang10phantu;

import java.util.Scanner;

public class Mang10phantu {

    public static void main(String[] args) {
        int[] arr1chieu = new int[10];
        int Tong = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr1chieu[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i = i + 2) {
            System.out.print(arr1chieu[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < 10; i = i + 2) {
            System.out.print(arr1chieu[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (arr1chieu[i] % 2 == 0) {
                System.out.print(arr1chieu[i] + "");
                Tong += arr1chieu[i];
            }

        }
        System.out.println("");
        System.out.println(Tong);
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (arr1chieu[i] % 5 == 1) {
                System.out.print(arr1chieu[i] + "");

            }

        }

    }

}
