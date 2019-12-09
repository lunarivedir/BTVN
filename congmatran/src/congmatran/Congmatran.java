package congmatran;

import java.util.Scanner;

public class Congmatran {

    public static void main(String[] args) {
        int i, j;

        Scanner ec = new Scanner(System.in);
        System.out.println("Nhap vao so hang va so cot cua ma tran");
        i = ec.nextInt();
        j = ec.nextInt();
        int[][] arr1 = new int[i][j];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma tran thu 1");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {

                arr1[a][b] = sc.nextInt();
                System.out.print(arr1[a][b] + "");

            }
            System.out.println("");
        }
        int[][] arr2 = new int[i][j];
        System.out.println("Nhap vao ma tran thu 2");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {

                arr2[a][b] = sc.nextInt();
                System.out.print(arr2[a][b] + "");

            }
            System.out.println("");
        }
        int[][] arrTong = new int[i][j];
        System.out.println("Tong cua 2 ma tran la");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                arrTong[a][b] = arr1[a][b] + arr2[a][b];

                System.out.print(arrTong[a][b] + "");
            }
            System.out.println("");
        }

    }

}
