package mang2chieu;

import java.util.Scanner;

public class Mang2chieu {

    public static void main(String[] args) {
//        int [] [] arr2chieu = { {1, 2},{2,3} };
//        int[] arr1 = new int[2];
//        arr1 = arr2chieu[0];
//        
        int[][] arr2 = new int[2][2];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = sc.nextInt();
                System.out.print(arr2[i][j] +"");
                
               
            }
            System.out.println("");
            

        }
        
        
        

    }

}
