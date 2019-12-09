package forlong;

import java.util.Scanner;

public class Forlong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        char[] c = {'!', '@', '#', '$', '%'};
        boolean check;
        for (int i = 0; i < ten.length(); i++) {
           
            for (int j = 0; j < c.length; j++) {
                if(ten.charAt(i) == c[j]){
                    check = false;
                    System.out.println("chua ky tu");
                    break;
                }

            }

        }

    }

}
