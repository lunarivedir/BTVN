
package ham2;

import java.util.Scanner;

public class Ham2 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        kiemtra(a, b);
    }
    public static boolean kiemtra(int a, int b){
        int tich = a * b;
        boolean check = false;
        if(tich % 3 == 0 && tich % 5 ==0){
            check = true;
            
        }
        System.out.println(check);
        
        return check;
    }
    
}
