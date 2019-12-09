package ham;

import java.util.Scanner;

public class Ham {

    public static boolean vidu(int x) {
        boolean check = false;
        for (int i = 2; i < x; i++) {
            if (x % i != 0) {
                check = true;
            } else {
                check = false;
                break;
            }

        }
        return check;
    }

    public static void main(String[] args) {
        // 1 2 5 10
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(vidu(x));

    }

}
