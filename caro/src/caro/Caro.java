package caro;

import java.util.Scanner;

public class Caro {

    static char[][] arr = new char[3][3];
    static int player1;
    static int count = 0;
    static int player2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '-';
            }
        }
        banco();
        while (true) {
            
            int input = nhapvitriPlayer1();
            capnhat1(input);
            if(checkWoL()){
                System.out.println("Player1 thang cuoc ");
                break;
            }
            banco();
            int input2 = nhapvitriPlayer2();
            capnhat2(input2);
            if(checkWoL()){
                System.out.println("Player2 thang cuoc ");
                break;
            }
            banco();
            

        }

    }

    private static int nhapvitriPlayer1() {
        System.out.println("Nhap vao vi tri player1 muon danh ");
        player1 = sc.nextInt();   
        
        return player1;
    }

    private static int nhapvitriPlayer2() {
        System.out.println("Nhap vao vi tri player2 muon danh ");
        player2 = sc.nextInt();
        
        return player2;
    }

    private static void banco() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("");
        }

    }
    
    private static void capnhat1(int player1) {
        switch (player1) {
            case 1:
                arr[2][0] = 'X';
                break;
            case 2:
                arr[2][1] = 'X';
                break;
            case 3:
                arr[2][2] = 'X';
                break;
            case 4:
                arr[1][0] = 'X';
                break;
            case 5:
                arr[1][1] = 'X';
                break;
            case 6:
                arr[1][2] = 'X';
                break;
            case 7:
                arr[0][0] = 'X';
                break;
            case 8:
                arr[0][1] = 'X';
                break;
            case 9:
                arr[0][2] = 'X';
                break;
        }
        

    }

    private static void capnhat2(int player2) {
        switch (player2) {
            case 1:
                arr[2][0] = 'O';
                break;
            case 2:
                arr[2][1] = 'O';
                break;
            case 3:
                arr[2][2] = 'O';
                break;
            case 4:
                arr[1][0] = 'O';
                break;
            case 5:
                arr[1][1] = 'O';
                break;
            case 6:
                arr[1][2] = 'O';
                break;
            case 7:
                arr[0][0] = 'O';
                break;
            case 8:
                arr[0][1] = 'O';
                break;
            case 9:
                arr[0][2] = 'O';
                break;
        }
    }

    private static boolean checkWoL() {
        if (arr[0][0] != 45 && arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) {
            return true;
        }
        if (arr[1][0] != 45 && arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) {
            return true;
        }
        if (arr[2][0] != 45 && arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) {
            return true;
        }
        if (arr[0][0] != 45 && arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) {
            return true;
        }
        if (arr[0][1] != 45 && arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) {
            return true;
        }
        if (arr[0][2] != 45 && arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) {
            return true;
        }
        if (arr[0][0] != 45 && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            return true;
        }
        if (arr[2][0] != 45 && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2]) {
            return true;
        }
        return false;
    }
}
