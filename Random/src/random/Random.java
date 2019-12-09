package random;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);
        System.out.println(random);

        Scanner ex = new Scanner(System.in);
     
        while(true){  
            int input = ex.nextInt();
            if(input>random){
                System.out.println("qua lon thu lai");
            }else if (input < random){
                System.out.println("qua lon thu lai");
            }else {
                System.out.println("chinh xac");
                break;
            }
            
            
        }
    }

}
