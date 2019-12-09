package lesson01;

import java.util.Scanner;

public class Lesson01 {

    public static void main(String[] args) {
//        float a = 2;
//        float b = 3;
//        float x;
//        if (a == 0) {
//            //true
//            if (b == 0) {
//                System.out.println("vo so nghiem");
//            } else {
//                System.out.println("vo nghiem");
//            }
//        } else {
//            //flase
//            x = -b / a;
//            System.out.println(x);
//        }

//        System.out.println("SCANNER");
//        Scanner ex = new Scanner(System.in);
//        int number;
//        System.out.println("Nhap gia tri cua a");
//        number = ex.nextInt();
//        System.out.println("Gia tri cua a la : " + number);
        //ax^2 + bx + c = 0
        double a;
        double b;
        double c;
        double x, x1, x2;
        Scanner ex = new Scanner(System.in);
        System.out.println("Nhap gia tri cua a b c");
        a = ex.nextDouble();
        b = ex.nextDouble();
        c = ex.nextDouble();
        double candelta = Math.sqrt(b * b - 4 * a * c);

        if (a == 0) {
            //True1
            if (b == 0) {
                //true2
                if (c == 0) {
                    System.out.println("vo so nghiem");

                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                x = -c / b;
                System.out.println(x);
            }

            //false2
        } else {
            double delta = b * b - 4 * a * c;
            if (delta >= 0) {
                if (delta > 0) {
                    x1 = (-b + candelta) / (2 * a);
                    x2 = (-b - candelta) / (2 * a);
                    System.out.println("Nghiem cua phuong trinh");
                    System.out.println(x1);
                    System.out.println(x2);
                } else {
                    x = -b / (2 * a);
                    System.out.println("phuong trinh co nghiem kep");
                    System.out.println(x);
                }
                //xet delta

            } else {
                System.out.println("phuong trinh vo nghiem");

            }
            //false1
        }
    }

}
