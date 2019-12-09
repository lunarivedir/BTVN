package arrayex;

import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int Min = arr[1];
        int Max = arr[1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao 10 so cua ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }

        }
        System.out.println("min la " + Min);
        System.out.println("max la" + Max);
    }

}
