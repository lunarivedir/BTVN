package fornew;

import java.util.Scanner;

public class menuSV {
    static Scanner sc = new Scanner(System.in);
    static Sinhvien[] svArr = new Sinhvien[100];
    static int count = 0;
    
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("--------------------------");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Sua thong tin");
            System.out.println("4. Xoa thong tin");
            System.out.println("--------------------------");
            switch (sc.nextInt()) {
            case 1:
                dsSV();
                break;
            case 2:
                themSV();
                break;
            case 3:
                suaSV();
                break;
            case 4:
                xoaSV();
                break;
                
            }
        }       
    }
    public static void dsSV(){
        if(count == 0){
            System.out.println("danh sach trong");
        }else{
            for(int i = 0; i<= count; i++){
                if(!svArr[i].isDelete){
                    svArr[i].dsSV();
                }
                System.out.println((count + 1) + "Ten :" + ten );
            }
        }
    }
    public static void themSV(){
        sc.nextLine();
        System.out.println("Ten :");
        String ten = sc.nextLine();
        System.out.println("MSSV");
        int mssv = sc.nextInt();
        
        System.out.println("tuoi");
        int tuoi = sc.nextInt();
        sc.nextLine();
        
        System.out.println("gioi tinh ");
        String gioitinh = sc.nextLine();
        svArr[count] = new Sinhvien(ten, mssv, tuoi, gioitinh);
        count++;
    }
}
