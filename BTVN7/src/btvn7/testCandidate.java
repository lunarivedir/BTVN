package btvn7;

import java.util.Scanner;

public class testCandidate {

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int count = 0;
    static Candidate[] svArr = new Candidate[n];

    public static void main(String[] args) {
        while (true) {
            if (count < n) {
                System.out.println("Nhap vao sinh vien thu " + (count + 1));
                themSV();

            } else {
                System.out.println("Danh sach sinh vien co tong diem tren 15");
                danhsachSV();
                break;

            }
        }

    }

    public static void themSV() {
        System.out.println("Ten Sinh Vien");
        String ten = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap mssv");
        int mssv = sc.nextInt();
        System.out.println("Nhap ngay thang nam sinh (xx/xx/19xx)");
        String date = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap diem (Theo thu tu Toan Van Anh )");
        int dToan = sc.nextInt();
        int dVan = sc.nextInt();
        int dAnh = sc.nextInt();
        
        
        svArr[count] = new Candidate(ten, mssv, date, dToan, dVan, dAnh);
        
        count++;
    }

    private static void danhsachSV() {
        for(int i = 0;i<count;i++){
            if(svArr[i].dToan + svArr[i].dVan + svArr[i].dAnh >= 15){
                svArr[i].hienthi();
            }
        }
    }
}

