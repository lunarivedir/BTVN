package lietkesnt;

public class LietKeSNt {

    public static int TimUoc(int x) {

        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }

        }
        return count;
    }

    public static boolean CheckSNT(int x) {
        boolean check = false;

        int count = TimUoc(x);
        if (count == 2) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static void LietKe(int x) {
        for (int i = 2; i < x; i++) {
            if (CheckSNT(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        int x = 10;
        LietKe(x);

    }

}
