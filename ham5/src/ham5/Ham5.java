package ham5;

import java.util.Scanner;

public class Ham5 {

    static char[][] arr = new char[5][5];
    static int playerX = 2;
    static int playerY = 2;

    static int dichX;
    static int dichY;
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        dichX = (int) (Math.random() * 5);
        dichY = (int) (Math.random() * 5);

        if (dichX == playerX && dichY == playerY) {
            dichX = (int) (Math.random() * 5);
            dichX = (int) (Math.random() * 5);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == playerX && j == playerY) {
                    arr[i][j] = 'P';
                } else if (i == dichX && j == dichY) {
                    arr[i][j] = 'G';
                } else {
                    arr[i][j] = 'o';
                }
            }

        }

        while (true) {
            map();
            char input = dichuyen();
            toado(input);
            System.out.println("diemso" + checkDiem());

        }

    }

    public static char dichuyen() {
        System.out.println("Nhap vao phim di chuyen");
        String x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        char diChuyen = x.charAt(0);
        return diChuyen;
    }

    private static void map() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");

        }

    }

    private static void toado(char c) {

        switch (c) {
            case 'W':
                arr[playerX][playerY] = 'o';
                playerX--;
                if (playerX < 0) {
                    playerX = 4;
                }
                arr[playerX][playerY] = 'P';

                break;

            case 'w':
                arr[playerX][playerY] = 'o';
                playerX--;
                if (playerX < 0) {
                    playerX = 4;
                }
                arr[playerX][playerY] = 'P';

                break;
            case 'S':
                arr[playerX][playerY] = 'o';
                playerX++;
                if (playerX > 4) {
                    playerX = 0;
                }
                arr[playerX][playerY] = 'P';

                break;
            case 's':
                arr[playerX][playerY] = 'o';
                playerX++;
                if (playerX > 4) {
                    playerX = 0;
                }
                arr[playerX][playerY] = 'P';

                break;
            case 'A':
                arr[playerX][playerY] = 'o';
                playerY--;
                if (playerY < 0) {
                    playerY = 4;
                }
                arr[playerX][playerY] = 'P';

                break;
            case 'a':
                arr[playerX][playerY] = 'o';
                playerY--;
                if (playerY < 0) {
                    playerY = 4;
                }
                arr[playerX][playerY] = 'P';

                break;
            case 'D':
                arr[playerX][playerY] = 'o';
                playerY++;
                if (playerY > 4) {
                    playerY = 0;
                }
                arr[playerX][playerY] = 'P';

                break;
            case 'd':
                arr[playerX][playerY] = 'o';
                playerY++;
                if (playerY > 4) {
                    playerY = 0;
                }
                arr[playerX][playerY] = 'P';

                break;
            default:

        }
    }

    private static int checkDiem() {

        if (arr[playerX][playerY] == arr[dichX][dichY]) {
            count++;
            dichX = (int) (Math.random() * 5);
            dichY = (int) (Math.random() * 5);

            if (dichX == playerX && dichY == playerY) {
                dichX = (int) (Math.random() * 5);
                dichX = (int) (Math.random() * 5);
            }

            arr[dichX][dichY] = 'G';

        }

        return count;
    }

}
