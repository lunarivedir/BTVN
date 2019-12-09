
package minvamax;

import java.util.Scanner;

public class MinVaMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        for(int i = 0; i <10;i++){
            System.out.println("Nhap vao 10 so : ");
            int input = sc.nextInt();
            if( input > Max) {
                Max = input;
            }
            if (input < Min) {
                Min = input;
            }
            
        }
        System.out.println(Min );
        System.out.println(Max);
    }
    
}
