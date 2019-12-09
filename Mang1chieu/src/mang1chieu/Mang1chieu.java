package mang1chieu;

import java.util.Scanner;

public class Mang1chieu {

    public static void main(String[] args) {
        int i;
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        i = sc.nextInt();
        System.out.println("Nhap gia tri cua x muon so sanh");
        x = sc.nextInt();

        int[] arr1chieu = new int[i];
        int Max = arr1chieu[0];
        int Min = arr1chieu[0];
        System.out.println("Nhap cac gia tri cua mang");
        for (int a = 0; a < i; a++) {
            arr1chieu[a] = sc.nextInt();

        }
        for (int a = 0; a < i; a++) {
            if (arr1chieu[a] > Max) {
                Max = arr1chieu[a];
                
                
            }

        }

        System.out.println("Gia tri cua max la" + Max);
        System.out.println("Cac gia tri nho hon x");
        for (int a = 0; a < i; a++) {
            if (arr1chieu[a] < x) {
                System.out.print(arr1chieu[a] + "");
            }

        }
        System.out.println("");

        System.out.println("Mang sau khi thay so le thanh -1");
        int[] arr1chieu2 = new int[i];
        arr1chieu2 = arr1chieu;
        for (int a = 0; a < i; a++) {
            if (arr1chieu2[a] % 2 == 1) {
                arr1chieu2[a] = -1;
            }
            System.out.print(arr1chieu2[a] + "\t");

        }

    }

}
