package baitap;

import java.util.Scanner;

public class Baitap {

    public static void main(String[] args) {
        int x1;
        int x2;
        
        Scanner ex = new Scanner(System.in);
        System.out.println("Nhap gia tri cua so thu nhat");
        x1 = ex.nextInt();
        System.out.println("Nhap gia tri cua so thu hai");
        x2 = ex.nextInt();
        int c = x2 % 10;
        int b = (x2 % 100 - c) / 10;
        int a = (x2 - b - c) / 100;

        if (x2 > 0) {
            if (x2 < 10) {
                System.out.println("Ket qua phep nhan");
                System.out.println(x1);
                System.out.println("x" + x2);
                System.out.println("--------");
                System.out.println(x1 * x2);
            }else{
                if(x2<100){
                    System.out.println("Ket qua phep nhan");
                System.out.println(x1);
                System.out.println("x" + x2);
                System.out.println("--------");

                System.out.println(" " + (x1 * c));
                System.out.println("" + (x1 * b));
                System.out.println("--------");
                System.out.println(x1 * x2);
                }else{
                    System.out.println("Ket qua phep nhan");
                System.out.println(x1);
                System.out.println("x" + x2);
                System.out.println("--------");

                System.out.println("  " + (x1 * c));
                System.out.println(" " + (x1 * b));
                System.out.println("" + (x1 * a));
                System.out.println("--------");
                System.out.println(x1 * x2);
                }

        }
    }else{
            System.out.println("Ket qua phep nhan");
                System.out.println(x1);
                System.out.println("x" + x2);
                System.out.println("--------");
                System.out.println(0);
        }

    
    


    }

}
