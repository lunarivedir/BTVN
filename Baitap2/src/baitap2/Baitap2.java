
package baitap2;

import java.util.Scanner;

public class Baitap2 {

    public static void main(String[] args) {
        int x1;
        int x2;
        Scanner ex = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong thu nhat");
        x1 = ex.nextInt();
        System.out.println("Nhap vao so nguyen duong thu hai");
        x2 = ex.nextInt();
        int x3=x1+x2;
        if(x3%2==0){
            System.out.println("tong cua chung la so chan : "+x3 );
        }else{
            System.out.println("tong cua chung la so le : " +x3);
        }
        
    }
    
}
