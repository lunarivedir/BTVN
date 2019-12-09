
package minmax;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in); 
        int tong = 0;
        while(true){
            int input = ex.nextInt();
            if(input == -1) {
                break;
            }
            tong += input;
        }
        System.out.println(tong);
    }
    
}
