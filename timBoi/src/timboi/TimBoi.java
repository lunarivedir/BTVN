
package timboi;

import java.util.Scanner;

public class TimBoi {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean check[] = new boolean[n];
        check[0]= true;
        check[1]=true;
        for(int i =2;i<n;i++){
            if(check[i]==false){
                System.out.println(i);
                for(int j=i*2;j<n;j+=i){
                    check[j]=true;
                }
            }
        }
    }
    
}
