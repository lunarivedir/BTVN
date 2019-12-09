
package exstring;

import java.util.Scanner;

public class ExString {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String ten = sc.nextLine();
       String c = "!@#$";
       for(int i=0;i<c.length();i++){
           char temp = c.charAt(i);
           String temp2 = String.valueOf(temp);
           boolean check ;
           if(ten.contains(temp2)){
               System.out.println("ten chua ky tu dac biet");
               check = false;
               break;
           }
           if(check = true){
               System.out.println("khong");
               break;
           }
       }
       
    }
    
}
