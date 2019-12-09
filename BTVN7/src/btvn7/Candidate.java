package btvn7;

public class Candidate {

    String ten;
    int mssv, dToan, dVan, dAnh;
    String date;

    public Candidate(String ten, int mssv, String date, int dToan, int dVan, int dAnh) {
        this.ten = ten;
        this.mssv = mssv;
        this.date = date;
        this.dToan = dToan;
        this.dVan = dVan;
        this.dAnh = dAnh;

    }

    public void hienthi() {

        System.out.println("Ten : " + ten + " , Date of birth : " + date + " , MSSV : " + mssv + " , diem Toan : " + dToan + " , diem Van : " + dVan + " , diem Anh : " + dAnh);

    }

}
